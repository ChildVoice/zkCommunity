package org.lzk.community.controller;

import org.lzk.community.dto.AccessTokenDto;
import org.lzk.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state){
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setClient_id("15b23157cb3e66c1e132");
        accessTokenDto.setClient_secret("0150d69eb337f784393ae82c4b1b1afdbbf771c6");
        accessTokenDto.setCode(code);
        accessTokenDto.setRedirect_uri("http://localhost:8881/callback");
        accessTokenDto.setState(state);
        githubProvider.getAccessToken(accessTokenDto);
        return "index";

    }
}
