package org.kurganov.datamapper;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyIdentity {

    private Map<Integer, Info> infoMap = new HashMap<>();

    public Info getInfo(Integer key) {
        return infoMap.get(key);
    }

    public void addInfo(Info info) {
        infoMap.put(info.getId(), info);
    }

    public Map<Integer, Info> getInfoMap() {
        return infoMap;
    }

    public void setInfoMap(Map<Integer, Info> infoMap) {
        this.infoMap = infoMap;
    }
}
