package com.grupoe.recarga.recarga.service;

import com.grupoe.recarga.recarga.domain.Classification;
import com.grupoe.recarga.recarga.domain.Recharge;
import com.grupoe.recarga.recarga.repository.ClassificationRepository;
import com.grupoe.recarga.recarga.repository.RechargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovementService {

    @Autowired
    private RechargeRepository rechargeRepositoy;

    @Autowired
    private ClassificationRepository classificationRepository;

    @Transactional
    public Recharge add(long id, long value, final String card, final String payment) {
        return null;
    }

    private Classification getDefaultClassification(){
        final String name = "Padrão";

        return classificationRepository.save(new Classification()
                .settype(name)
                .setDescription("Descrição Padrão"));
    }

    public Recharge add(Recharge recharge) {
        return rechargeRepositoy.save(recharge);
    }

    public List<Recharge> findAll() {
        return (List<Recharge>) rechargeRepositoy.findAll();
    }
}
