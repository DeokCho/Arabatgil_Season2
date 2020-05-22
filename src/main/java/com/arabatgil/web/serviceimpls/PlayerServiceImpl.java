package com.arabatgil.web.serviceimpls;

import com.arabatgil.web.domains.PlayerDTO;
import com.arabatgil.web.mappers.PlayerMapper;
import com.arabatgil.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired PlayerMapper playerMapper;
    @Override
    public List<PlayerDTO> retrieve() {
        return playerMapper.selectAll();
    }

    @Override
    public PlayerDTO findOne(String searchWord) {
        return playerMapper.selectOne(searchWord);
    }
    @Override
    public PlayerDTO login(PlayerDTO params) {
        return playerMapper.login(params);
    }
}