package dev.patika.week4assignment.service;

import dev.patika.week4assignment.converter.ExpeditionConverter;
import dev.patika.week4assignment.entity.Expedition;
import dev.patika.week4assignment.repository.ExpeditionRepository;
import dev.patika.week4assignment.responseDto.GetAllExpeditionResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpeditionService {
    private final ExpeditionRepository expeditionRepository;
    private final ExpeditionConverter expeditionConverter;

    public List<GetAllExpeditionResponseDto> getAllExpeditionResponseDtoList() {
        List<Expedition> expeditionList = (List<Expedition>) expeditionRepository.findAll();
        return expeditionConverter.ConvertToGetAllExpeditionResponseDtoByExpedition(expeditionList);
    }
}
