package com.chouette.rankingWeb.vo.std;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StdWinningRewardVO {
    private Integer idx;
    @NotNull
    private LocalDate applyDttm;
    @NotNull
    private Double rewardWeight;
    @NotNull
    private Double weight;
    private Integer regUser;
    private LocalDateTime regDttm;

    //none db
    private String regUserId;
}
