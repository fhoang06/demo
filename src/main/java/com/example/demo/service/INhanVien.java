package com.example.demo.service;

import com.example.demo.model.NhanVien;

import java.util.List;

public interface INhanVien {

    //add
    public NhanVien addNhanVien(NhanVien nha);

    //update
    public NhanVien updateNhanVien(long id, NhanVien nhanVien);

    //delete
    public boolean deleteNhanVien(long id);

    //list
    public List<NhanVien> getAllNhanVien();

    //getbyid
    public NhanVien getOneNhanVien(long id);
}
