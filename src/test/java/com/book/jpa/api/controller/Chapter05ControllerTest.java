package com.book.jpa.api.controller;

import com.book.jpa.api.repository.MemberRepository;
import com.book.jpa.api.repository.TeamRepository;
import com.book.jpa.chapter05.Member;
import com.book.jpa.chapter05.Team;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Transactional
@SpringBootTest
@AutoConfigureMockMvc
class Chapter05ControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TeamRepository teamRepository;

    @DisplayName("")
    @Test
    void test() throws Exception {
        mockMvc.perform(post("/chapter05/member/save"))
                .andExpect(status().isOk())
                ;

        List<Member> members = memberRepository.findAll();
        Long teamId = members.get(0).getTeam().getId();

        List<Team> teams = teamRepository.findAll();
        teams.forEach(System.out::println);

        Assertions.assertThat(teams.get(0).getId()).isEqualTo(teamId);
    }
}