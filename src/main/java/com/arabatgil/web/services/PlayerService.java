package com.arabatgil.web.services;

import com.arabatgil.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PlayerService {
    public List<PlayerDTO> retrieve();
    public PlayerDTO findOne(String searchWord);
    public PlayerDTO login(PlayerDTO params);
}