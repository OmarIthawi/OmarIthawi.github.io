/*
    Better OOP by making cleaner Setter, Getter!
    For eazier programming.
    
    Copyright (C) 2009  Omar Al-Dolaimy (http://www.omardo.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import java.util.*;

public class BetterGetterAndSetter {
	public static void main (String args[]) {		
		Scanner scan = new Scanner( System.in );
//		تعريف الكائن
		Dot3D someDot = new Dot3D();

//		SETTERS
//		 إسناد قيمة س، ص بالطريقة المختصرة
//		 وهي أشبه بالطريقة القديمة لحد الآن 		
		someDot.x(10);
		someDot.y(20);
		
//		أنظر هذا الإختصار أليس أفضل؟
		someDot.x(20).y(120);

//		أو هذا
		someDot.z(10).x(24).y(10).x(20);


//		وأنظر الآن جمال الفكرة! أن 
//		 Setter looks like getter!
//			GETTERS!
		int a = someDot.x();
//		الفرق بينهما أن عند إسناد قيمة يجب أن تمررها داخل الطريق (ميثود)ـ
// 		أما عند طلب الحصول على القيمة ببساطة! لا تمرر وسيط (بارميتير) وتحصل على القيمة الحالية لها!
		
		
// 		Getters After Setter!
// 		تستطيع المزج في الأمر الواحد بين عدة مسندات (سيتير) وفي النهاية محصل واحد (كيتر) أنظر التالي:
		int num = someDot.x(20).y(50).z();
//		في هذه الحالة نحن نسند قيمة لكل من س، ص وبعدها نأخذ قيمة ع ونضعها في المتغير (نام)ـ
		
// 		هذا مثال لطباعة قيم س، ص، ع للكائن. الكود نظيف وبسيط وواضح!
		System.out.println("X: " + someDot.x() + ", Y: " + someDot.y() + ", Z: " + someDot.z() ); 
	}
}

class Dot3D {
	// Properties || Dimentions
	private int pX=0, pY=0, pZ=0;
	
	// Setter's
	public Dot3D x(int val) {
		pX = val;
		return this;
	}
	
	public Dot3D y(int val) {
		pY = val;
		return this;
	}
	
	public Dot3D z(int val) {
		pZ = val;
		return this;
	}
	
	// Getter's
	public int x() {
		return pX;
	}
	
	public int y() {
		return pY;
	}
	
	public int z() {
		return pZ;
	}
	
}

/*
// OLD WAY TO SET, GET! 
// Set values
someDot.setX(10);
someDot.setY(13);
someDot.setZ(48);

// Print them
System.out.println("X: " + someDot.getX() + ", Y: " + someDot.getY() + ", Z: " + someDot.getZ() ); 


*/
