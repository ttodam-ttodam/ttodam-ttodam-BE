package com.ttodampartners.ttodamttodam.domain.keyword.controller;

import com.ttodampartners.ttodamttodam.domain.keyword.dto.request.KeywordUpdateRequestDto;
import com.ttodampartners.ttodamttodam.domain.keyword.dto.response.KeywordCreateResponseDto;
import com.ttodampartners.ttodamttodam.domain.keyword.service.KeywordUpdateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KeywordUpdateController {
  private final KeywordUpdateService keywordUpdateService;

  @PutMapping("users/keywords")
  public ResponseEntity<?> updateKeyword(
      @ModelAttribute @Valid KeywordUpdateRequestDto keywordUpdateRequestDto) {

    KeywordCreateResponseDto keywordCreateResponseDto =
        keywordUpdateService.updateKeyword(keywordUpdateRequestDto);

    return ResponseEntity.ok(keywordCreateResponseDto);
  }
}
