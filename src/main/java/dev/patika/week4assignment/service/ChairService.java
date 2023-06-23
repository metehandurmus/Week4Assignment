package dev.patika.week4assignment.service;

import dev.patika.week4assignment.converter.ChairConverter;
import dev.patika.week4assignment.repository.ChairRepository;

import dev.patika.week4assignment.repository.TicketRepository;
import dev.patika.week4assignment.responseDto.ShowChairResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChairService {
    private final ChairRepository chairRepository;
    private final ChairConverter chairConverter;
    private final TicketRepository ticketRepository;

    public List<ShowChairResponseDto> getByExpeditionId(long id) {
        List<ShowChairResponseDto> showChairResponseDtoList = chairConverter.ConvertToShowChairResponseDtoListByChairList(chairRepository.findByExpeditionId(id));
        showChairResponseDtoList = showChairResponseDtoList.stream().filter(dto -> ticketRepository.findByChairId(dto.getId()).isEmpty()).toList();
        return showChairResponseDtoList;
    }
}