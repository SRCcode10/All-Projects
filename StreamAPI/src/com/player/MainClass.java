package com.player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		Player p1 = new Player("Sanjit", 955);
		Player p2 = new Player("frfr", 800);
		Player p3 = new Player("ijedi", 597);
		Player p4 = new Player("hdeuuf", 798);
		Player p5 = new Player("efrf", 985);
		
		TreeSet<Player> tset = new TreeSet<>((x,y)-> (y.getScore()-x.getScore()));
		
		
//		Set<Player> playset = new HashSet<>();
		tset.add(p1);
		tset.add(p2);
		tset.add(p3);
		tset.add(p4);
		tset.add(p5);
		Player player = tset.stream().max((x,y)->(x.getScore()-y.getScore())).get();
		System.out.println(player);
		//System.out.println(tset);
//		List<Player> list = playset.stream().sorted((x,y)->(x.getScore()-y.getScore())).collect(Collectors.toList());
//		System.out.println(list);
	}

}
