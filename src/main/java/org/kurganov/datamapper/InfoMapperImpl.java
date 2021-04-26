package org.kurganov.datamapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoMapperImpl implements InfoMapper {

    @Autowired
    private InfoRepo infoRepo;

    @Override
    public List<Info> findAll() {
        return infoRepo.findAll();
    }
}
