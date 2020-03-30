
package com.subho.wipro.pjp.tm03.Interfaces.q2.live;

import com.subho.wipro.pjp.tm03.Interfaces.q2.music.*;
import com.subho.wipro.pjp.tm03.Interfaces.q2.music.string.Veena;
import com.subho.wipro.pjp.tm03.Interfaces.q2.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		v.play();
		Saxophone s= new Saxophone();
		s.play();
		Playable p = s;
		s.play();
		p = v;
		v.play();
	}

}