package org.kurganov.datamapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoMapperImpl implements InfoMapper {

    @Autowired
    private InfoRepo infoRepo;

    @Autowired
    private MyIdentity buffer;

    @Override
    public List<Info> findAll() {
        return infoRepo.findAll();
    }

    @Override
    public Info findById(Integer id) {
        if (buffer.getInfoMap().containsKey(id)) {
            System.out.println("Значение найдено! Возвращаем из Map`ы!");
            return buffer.getInfo(id);
        } else {
            buffer.addInfo(infoRepo.findById(id).get());
            System.out.println("Значение не найдено! Делаем обращение к БД и помещаем в Map`у!");
            System.out.println("Вернули из Map`ы! " + buffer.getInfo(id).getName());
            return buffer.getInfo(id);
        }
    }
}
