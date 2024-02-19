package org.example.service;

import java.util.List;
import org.example.entity.Singer;

public interface SingerService {
  Singer findById(int id);
  List<Singer> findAll();
}
