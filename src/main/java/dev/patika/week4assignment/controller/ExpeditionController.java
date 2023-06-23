package dev.patika.week4assignment.controller;

import dev.patika.week4assignment.responseDto.GetAllExpeditionResponseDto;
import dev.patika.week4assignment.service.ExpeditionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/expedition")
@RequiredArgsConstructor
public class ExpeditionController {
    private final ExpeditionService expeditionService;

    @GetMapping("/all")
    public List<GetAllExpeditionResponseDto> getAllExpeditionResponseDtoList() {
        return expeditionService.getAllExpeditionResponseDtoList();
    }
}
