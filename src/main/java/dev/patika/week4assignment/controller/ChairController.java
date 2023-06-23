package dev.patika.week4assignment.controller;

import dev.patika.week4assignment.responseDto.ShowChairResponseDto;
import dev.patika.week4assignment.service.ChairService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/chair")
@RequiredArgsConstructor
public class ChairController {
    private final ChairService chairService;

    @GetMapping("/show")
    public List<ShowChairResponseDto> getChairByExpeditionId(@RequestParam(name = "expeditionId") long expeditionId) {
        return chairService.getByExpeditionId(expeditionId);
    }
}
