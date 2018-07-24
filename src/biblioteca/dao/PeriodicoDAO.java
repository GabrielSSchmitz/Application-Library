package biblioteca.dao;

import biblioteca.entidade.*;

public interface PeriodicoDAO {
	
	void salvaPeriodico(Periodico periodico);
	
	Periodico procuraPeriodicol (int codigo); 
	
}
