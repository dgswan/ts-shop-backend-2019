package com.tsystems.tshop.client;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class ClientRepository {

    private static final String QUERY_CLIENTS = "SELECT id, name, surname FROM clients";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public ClientRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Set<Client> getClients(String nameFilter) {
//        final SqlParameterSource params =
//                new MapSqlParameterSource()
//                .addValue("name", nameFilter);
        return new HashSet<>(
                jdbcTemplate.query(QUERY_CLIENTS,
                        BeanPropertyRowMapper.newInstance(Client.class)));
    }

}
