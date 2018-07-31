package biblioteca.dao;

import biblioteca.entidade.*;

public interface MaterialDAO {
	
	void salvaMaterial(Material material);
	
	Material procuraMaterial (String codigo); 
	
}
