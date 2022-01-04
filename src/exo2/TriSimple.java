package exo2;


public class TriSimple {
	private int _max_size=10;
	private int _tab[];
	private int _i=0;
	private int _increment=3;
	
	public TriSimple() {
		//_tab=new ArrayList<Integer>();
		_tab=new int[_max_size];
	}
	public TriSimple(int max_size) {
		_max_size=max_size;
		_tab=new int[max_size];
		//_tab=new ArrayList<Integer>();
	}	
	public void insert(int elem) {
		//int aux;
		int tab2[];
		if(_i==0) {
			_tab[_i]=elem;
		}
		else {
			if((_i+_increment)==_max_size) {
				_max_size+=_increment;
				tab2=new int[_max_size];
				for(int i=0;i<_i;i++) {
					tab2[i]=_tab[i];
				}
				_tab=tab2;
			}
				if(elem<_tab[0]) {
					for(int i=_i;i>0;i--) {
						_tab[i]=_tab[i-1];
					}
					_tab[0]=elem;
				}
				else {
					
					for(int i=_i-1;i>=0;i--) {
						if(_tab[i]>elem)	_tab[i+1]=_tab[i];
						else {
							_tab[i+1]=elem;
							break;
						}
					}
					
				}
			
		}	
		_i++;
		
	}
	
	public int getSize() {
		return _i;
	}
	
	public boolean exist_elem(int elem) {
		for(int i=0;i<_i;i++) {
			if(_tab[i]==elem)
				return true;
		}
		return false;
	}
	
	public void remove(int elem) {
		//_tab.remove(elem);
		if(exist_elem(elem)) {
			int nb=_max_size-_i;
			boolean rm=false;
			if(_i!=0) {
				if((nb>=2*_increment)) {
					int tab[]=new int[_i];
					for(int i=0;i<_i;i++)
						tab[i]=_tab[i];
					_tab=tab;
					_max_size=_max_size-_increment;
				}
				
				for(int i=0;i<_i;i++) {
					if(elem==_tab[i]) {
						for(int j=i;j<_i-1;j++)
							_tab[j]=_tab[j+1];
						rm=true;
						break;
					}
				}
				
				if(rm) {
					_i--;
					_tab[_i]=0;
				}
			}
		}
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<_i;i++) {
			s+=_tab[i]+"\t";
		}
		return s;
	}
	

}
