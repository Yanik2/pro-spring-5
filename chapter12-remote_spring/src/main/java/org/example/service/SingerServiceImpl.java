package org.example.service;

import java.util.List;
import org.example.entity.Singer;
import org.springframework.stereotype.Service;

@Service
public class SingerServiceImpl implements SingerService {
  @Override
  public Singer findById(int id) {
    return new Singer("john", "krasinski");
  }

  @Override
  public List<Singer> findAll() {
    return List.of(findById(1));
  }
}
