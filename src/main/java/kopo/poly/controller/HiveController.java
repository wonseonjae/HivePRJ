package kopo.poly.controller;

import kopo.poly.dto.HiveDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import kopo.poly.service.IHiveService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class HiveController {

    @Resource(name="HiveService")
    private IHiveService hiveService;

    @GetMapping(value= "hive/getComediesCnt")
    public HiveDTO getComediesCnt(ModelMap model) throws Exception{
        HiveDTO rDTO = hiveService.getComediesCnt();

        if (rDTO == null) {
            rDTO = new HiveDTO();
        }

        return rDTO;
    }
}
