package sumDivisors;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZombieCluster {
	static int zombieCluster(String[] zombies) {

		BitSet bs = null;
		ArrayList<BitSet> al = new ArrayList<BitSet>();
    	
		for (int i=0;i<zombies.length;i++){
			bs= new BitSet(zombies[i].length());
			for(int j=0;j<zombies[i].length();j++){
				if(zombies[i].charAt(j)=='1')
					bs.set(j);
			}
			al.add(bs);
		}
		
		for(int i=0; i<al.size()-1; i++){
			for(int j=i+1; j<al.size(); j++){
				if(i!=j && al.get(i).intersects(al.get(j))){
					al.get(i).or(al.get(j));
					al.remove(j);
					j = 0;
				}
			}
		}
		return al.size();

    }
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int res;
        
        int _zombies_size = 0;
        _zombies_size = Integer.parseInt(in.nextLine().trim());
        String[] _zombies = new String[_zombies_size];
        String _zombies_item;
        for(int _zombies_i = 0; _zombies_i < _zombies_size; _zombies_i++) {
            try {
                _zombies_item = in.nextLine();
            } catch (Exception e) {
                _zombies_item = null;
            }
            _zombies[_zombies_i] = _zombies_item;
        }
        in.close();
        
        res = zombieCluster(_zombies);
        System.out.println(String.valueOf(res));
    }

}
