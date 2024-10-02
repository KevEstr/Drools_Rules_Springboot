package com.udea.labFundamentos.service;

import com.udea.labFundamentos.model.Participant;
import com.udea.labFundamentos.model.Rate;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {
    @Autowired
    private KieContainer kieContainer;
    public Rate getRate(Participant applicationRequest){
        Rate rate = new Rate();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("rate", rate);
        kieSession.insert(applicationRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return rate;
    }
}

