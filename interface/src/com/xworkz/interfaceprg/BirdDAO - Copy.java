package com.xworkz.interfaceprg;

public interface BirdDAO {

	void save(BirdDTO breed);

	void update(int index,BirdDTO breed);

	void delete( int index);
}
