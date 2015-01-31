---
layout: post
status: publish
published: true
title: "فكرة! في كتابة الجافا OOP ـ set, get أسهل عند إعادة إستخدام الكود."
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 464
wordpress_url: http://www.omardo.com/blog/?p=464
date: '2009-01-03 20:52:23 +0000'
date_gmt: '2009-01-03 18:52:23 +0000'
---
<p><strong>مرحباً</strong>. منذ زمن لم أكتب شيئاً تقنياً.</p>
<p>والآن جاء الوقت لكي أعطيكم جرعة قاتله من المواضيع التقنية ^^. سأبدأ بهذه الفكرة التي إكتشفتها اليوم. ربما تبدو غريبة لمبرمجي الجافا لكنها عملية جداً وتفيد لصنع كود قابل لإعادة الإستخدام وكي نطبق مبدأ (<a href="http://almsaodi.com/?p=48">عدم إختراع العجلة</a>!). بعد المقدمة، أبدأ بالزبدة.</p>
<p>الفكرة وما فيها هي وضع طريقة أفضل وأكثر عملية للبرمجة الكائنية وخصوصاً <strong>الـSetter</strong> والـ<strong>Getter</strong> للفئات.<br />
(تحتاج لفهم هذا دراسة أساسيات لغة الجافا أو أي لغة برمجة تدعم <strong>oop</strong> وكذلك دراسة البرمجة الكائنية <strong>OOP</strong> بها، إن لم تكن كذلك فلا تقرأ المقال!).</p>
<p>ربما كما درست فإن مبرمجي الجافا يفضلون وضع <strong>Setter</strong> <strong>وGetter</strong> لكل خاصية(<strong>Properties</strong>) في الصنف بدلاً من ترك الخاصية <strong>public</strong> للسيطرة عليها في حال طرأ تغيير عليها. وهي طريقة جداً جملية حيث بها تضمن قلة الأخطاء إلى أدنى حد ممكن. خصوصاً إذا كنت مطور مكتبات (<strong>Programming</strong> <strong>Libraries</strong>) أو مطور <strong>SDK</strong> ولو كانت صغيرة. سترى أن هذا الأمر مهم جداً للسيطرة على الكود وإدراته وإستخدام ميزات <strong>oop</strong> بأفضل وجه (تابع قراءة المقال).<!--more--></p>
<p>لكن الطريقة العادية في وضع الـ<strong>Setter</strong>, <strong>Getter</strong> طريقة سيئة برأيي. وندرسها نحن في مقرر الـ<strong>Java-oop</strong> كطلاب علم الحاسوب.</p>
<p>مثلاً <strong>someDot</strong> هو كائن من الصنف <strong>Dot3D</strong> لديه ثلاث خواص هم <strong>x, y, z</strong> يمثلون موقع النقطة في مستوى الأحداثيات.<br />
لو أردنا التحكم بالخواص من خلال وضع <strong>Setter</strong>, <strong>Getter</strong> لكل واحدة سنقوم بوضع <strong>الـMethods</strong> كما نعرف وكالمعتاد سنعرف الصنف وسينتج كائن <strong>someDot</strong> قابلاً للإستخدام كالتالي:</p>
<pre class="php"><span style="font-style: italic; color: #666666;">// Set values</span>
someDot<span style="color: #339933;">.</span>setX<span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
someDot<span style="color: #339933;">.</span>setY<span style="color: #009900;">(</span><span style="color: #cc66cc;">13</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
someDot<span style="color: #339933;">.</span>setZ<span style="color: #009900;">(</span><span style="color: #cc66cc;">48</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>

<span style="font-style: italic; color: #666666;">// Print them</span>
<a href="http://www.php.net/system"><span style="color: #990000;">System</span></a><span style="color: #339933;">.</span>out<span style="color: #339933;">.</span>println<span style="color: #009900;">(</span><span style="color: #0000ff;">"X: "</span> <span style="color: #339933;">+</span> someDot<span style="color: #339933;">.</span>getX<span style="color: #009900;">(</span><span style="color: #009900;">)</span>
<span style="color: #339933;">+</span> <span style="color: #0000ff;">", Y: "</span> <span style="color: #339933;">+</span> someDot<span style="color: #339933;">.</span>getY<span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #339933;">+</span> <span style="color: #0000ff;">", Z: "</span> <span style="color: #339933;">+</span> someDot<span style="color: #339933;">.</span>getZ<span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p>ألا ترى ان هذه العملية مزعجة؟ أن تقوم بإسناد القيم لكل خاصية بواسطة <strong>Setter</strong> مستقل؟ ماذا لو كان هناك <strong>Setter</strong> يعمل بصورة متفاعلة بحيث تعطيه الخاصية وقيمتها أو الخواص وقيمهم، وبدون ترتيب إجباري؟ أو عدد معين من الخواص؟؟ هل تريد طريقة تختصر عليك الكتابة بأفضل وجه؟ وبكود مفهوم؟ هذا ما فعلته!</p>
<p>أنظر هذا الكود، وتعلم كيف ستستطيع وبكل سهولة الحصول على واحد مثله بيدك!، لاحظ الشرح<strong> <span style="text-decoration: underline;">بعد</span> </strong>الكود:</p>
<pre class="php">someDot<span style="color: #339933;">.</span>x<span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
someDot<span style="color: #339933;">.</span>y<span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p><em>هنا وضعنا قيمة لكل من <strong>x, y</strong>. بواسطة <strong>Setter</strong> سهل التذكر! وكذلك إملائياً سهل أن تفهم ماهو!</em></p>
<p><em></em></p>
<pre class="php">someDot<span style="color: #339933;">.</span>x<span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span><span style="color: #339933;">.</span>y<span style="color: #009900;">(</span><span style="color: #cc66cc;">120</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p><em>هل رأيت هذا الكود! أليس أجمل؟ إسندنا القيم لكليهما في نفس الأمر!</em></p>
<p><em></em></p>
<pre class="php">someDot<span style="color: #339933;">.</span>z<span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span><span style="color: #339933;">.</span>x<span style="color: #009900;">(</span><span style="color: #cc66cc;">24</span><span style="color: #009900;">)</span><span style="color: #339933;">.</span>y<span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span><span style="color: #339933;">.</span>x<span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p><em>وهذا! بعد! هل رأيت تغيير أربع قيم! من ضمنها القيمة س مرتين، لا يوجد ترتيب إجباري ولا عدد معين من المرات للتغيير.</em></p>
<p>ربما تفكر الآن وكيف نأخذ القيم بواسطة <strong>Getter</strong> وبنفس السهولة؟؟ شاهد الأكواد التالية وأنظر الشرح بعد كل واحد:</p>
<pre class="php"><strong>int</strong> a <span style="color: #339933;">=</span> someDot<span style="color: #339933;">.</span>x<span style="color: #009900;">(</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p><em>الفرق بينهما أن عند إسناد قيمة يجب أن تمررها داخل الطريق (ميثود)ـ<br />
أما عند طلب الحصول على القيمة ببساطة! لا تمرر وسيط (parameter) وتحصل على القيمة الحالية لها!</em></p>
<p><em></em></p>
<pre class="php"><strong>int</strong> num <span style="color: #339933;">=</span> someDot<span style="color: #339933;">.</span>x<span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span><span style="color: #339933;">.</span>y<span style="color: #009900;">(</span><span style="color: #cc66cc;">50</span><span style="color: #009900;">)</span><span style="color: #339933;">.</span>z<span style="color: #009900;">(</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p><em>نستطيع المزج في الأمر الواحد بين عدة مسندات (<strong>setter</strong>) وفي النهاية محصل واحد (<strong>getter</strong>)<br />
في هذه الحالة نحن نسند قيمة لكل من <strong>x</strong>، <strong>y</strong> وبعدها نأخذ قيمة <strong>z</strong> ونضعها في المتغير (<strong>num</strong>)<br />
</em></p>
<p>هذه الفكرة لوجه الله أضعها لكم كي تستفيدوا منها :). وملاحظة، هذه الطريقة متبعة في بعض المكتبات مثل <strong>jQuery</strong>، مع أنها ليست في لغة جافا لكن لا بأس أن نتعلم منهم.</p>
<p>هل رأيت؟ ما رأيك بالفكرة؟؟ لدي لك مفاجأة .. الكود الكامل لكيفية عمل ذلك!<br />
أنظر <strong><a href="http://www.omardo.com/blog/archives/464/2">الصفحة التالية من هنا</a></strong>.</p>
<p><!--nextpage--></p>
<p>هذا الكود، المطلوب أن تفهمه أنني علمت نفس الطريق (<strong>Method</strong>) لكل خاصية بنفس الإسم. يعين الخاصية أسميها (<strong>pX</strong>) وإسم الطريقين (<strong>Method</strong>) هما <strong>x</strong> الأول وهو <strong>Getter</strong> ومن نوع القيمة التي يضعها مثل <strong>int</strong>, <strong>char</strong>, <strong>double</strong> أو أي كان!. والثاني وهو الـ <strong>Setter</strong> وهو من نوع الكائن نفسه حيث أنه يحتوي على جملة <strong>Return</strong> ترجع نفس الكائن بواسطة <strong>this</strong>. وكذلك يسند القيمة الممررة إليه إلى الخاصية (<strong>Properties</strong>) المطلوبة وفي هذه الحالة <strong>x</strong>.</p>
<p>في هذه الحالة يجب أن تعلم أنني عملت <strong>Overload</strong> لكل طريق (<strong>Method</strong>) مرتين الأول بشكل <strong>Setter</strong> والثاني <strong>Getter</strong>!</p>
<p>حمل الكود بملف جافا من هنا  <strong><a href="http://www.omardo.com/blog/wp-content/uploads/bettergetterandsetter.java">BetterGetterAndSetter.java</a></strong></p>
<p>(الكود هنا ملون لكن إن اردت الكود كاملاً بشكل ملف جافا حمله وإفتحه بمحررك المفضل مثل Eclipse, NetBeans, NotePadpp</p>
<pre class="java"><span style="font-style: italic; color: #666666;">/*
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
    along with this program.  If not, see &lt;http://www.gnu.org/licenses/&gt;.
*/</span>

<span style="font-weight: bold; color: #000000;">import</span> <span style="color: #006699;">java.util.*</span><span style="color: #339933;">;</span>

<span style="font-weight: bold; color: #000000;">public</span> <span style="font-weight: bold; color: #000000;">class</span> ReturnThis <span style="color: #009900;">{</span>
	<span style="font-weight: bold; color: #000000;">public</span> <span style="font-weight: bold; color: #000000;">static</span> <span style="font-weight: bold; color: #000066;">void</span> main <span style="color: #009900;">(</span><a href="http://www.google.com/search?hl=en&amp;q=allinurl%3AString+java.sun.com&amp;btnI=I%27m%20Feeling%20Lucky"><span style="color: #003399;">String</span></a> args<span style="color: #009900;">[</span><span style="color: #009900;">]</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		Scanner scan <span style="color: #339933;">=</span> <span style="font-weight: bold; color: #000000;">new</span> Scanner<span style="color: #009900;">(</span> <a href="http://www.google.com/search?hl=en&amp;q=allinurl%3ASystem+java.sun.com&amp;btnI=I%27m%20Feeling%20Lucky"><span style="color: #003399;">System</span></a>.<span style="color: #006633;">in</span> <span style="color: #009900;">)</span><span style="color: #339933;">;</span>
<span style="font-style: italic; color: #666666;">//		تعريف الكائن</span>
		Dot3D someDot <span style="color: #339933;">=</span> <span style="font-weight: bold; color: #000000;">new</span> Dot3D<span style="color: #009900;">(</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>

<span style="font-style: italic; color: #666666;">//		SETTERS</span>
<span style="font-style: italic; color: #666666;">//		 إسناد قيمة س، ص بالطريقة المختصرة</span>
<span style="font-style: italic; color: #666666;">//c<span>    </span><span>    </span><span>    </span></span><span style="font-style: italic; color: #666666;">وهي أشبه بالطريقة القديمة لحد الآن</span><span style="font-style: italic; color: #666666;"> 		</span>
		someDot.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
		someDot.<span style="color: #006633;">y</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>

<span style="font-style: italic; color: #666666;">//		أنظر هذا الإختصار أليس أفضل؟</span>
		someDot.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span>.<span style="color: #006633;">y</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">120</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>

<span style="font-style: italic; color: #666666;">//		أو هذا</span>
		someDot.<span style="color: #006633;">z</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span>.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">24</span><span style="color: #009900;">)</span>.<span style="color: #006633;">y</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">10</span><span style="color: #009900;">)</span>.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>

<span style="font-style: italic; color: #666666;">//		وأنظر الآن جمال الفكرة! أن </span>
<span style="font-style: italic; color: #666666;">//		 Setter looks like getter!</span>
<span style="font-style: italic; color: #666666;">//			GETTERS!</span>
		<span style="font-weight: bold; color: #000066;">int</span> a <span style="color: #339933;">=</span> someDot.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
<span style="font-style: italic; color: #666666;">/*</span>
<span style="font-style: italic; color: #666666;">//		الفرق بينهما أن عند إسناد قيمة
</span><span style="font-style: italic; color: #666666;">يجب أن تمررها داخل الطريق (ميثود)ـ<span>    </span><span>    </span><span>    </span></span><span style="font-style: italic; color: #666666;"> //</span>
<span style="font-style: italic; color: #666666;"> 	</span><span style="font-style: italic; color: #666666;">أما عند طلب الحصول على القيمة ببساطة!<span>    </span><span>   </span></span><span style="font-style: italic; color: #666666;">	//
</span><span style="font-style: italic; color: #666666;">لا تمرر وسيط (بارميتير) وتحصل على القيمة الحالية لها</span><span style="font-style: italic; color: #666666;"> //</span>

<span style="font-style: italic; color: #666666;">// 		Getters After Setter!</span>
<span style="font-style: italic; color: #666666;">// 		تستطيع المزج في الأمر الواحد بين عدة
                مسندات (سيتير)
 وفي النهاية محصل واحد (كيتر) أنظر التالي:
</span><span style="font-style: italic; color: #666666;">*/</span>
		<span style="font-weight: bold; color: #000066;">int</span> num <span style="color: #339933;">=</span> someDot.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">20</span><span style="color: #009900;">)</span>.<span style="color: #006633;">y</span><span style="color: #009900;">(</span><span style="color: #cc66cc;">50</span><span style="color: #009900;">)</span>.<span style="color: #006633;">z</span><span style="color: #009900;">(</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
<span style="font-style: italic; color: #666666;">//		في هذه الحالة نحن نسند قيمة لكل
من س، ص وبعدها نأخذ قيمة ع ونضعها في المتغير (نام)ـ<span>    </span><span>    </span><span>    </span>//</span>

<span style="font-style: italic; color: #666666;">// 		هذا مثال لطباعة قيم س، ص، ع للكائن. الكود
</span><span><span style="font-style: italic; color: #666666;">//</span></span><span style="font-style: italic; color: #666666;"> نظيف وبسيط وواضح!</span>

		<a href="http://www.google.com/search?hl=en&amp;q=allinurl%3ASystem+java.sun.com&amp;btnI=I%27m%20Feeling%20Lucky"><span style="color: #003399;">System</span></a>.<span style="color: #006633;">out</span>.<span style="color: #006633;">println</span><span style="color: #009900;">(</span><span style="color: #0000ff;">"X: "</span> <span style="color: #339933;">+</span> someDot.<span style="color: #006633;">x</span><span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #339933;">+</span> <span style="color: #0000ff;">", Y: "</span> <span style="color: #339933;">
<span>    </span><span> </span><span></span><span> </span>+</span> someDot.<span style="color: #006633;">y</span><span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #339933;">+</span> <span style="color: #0000ff;">", Z: "</span> <span style="color: #339933;">+</span> someDot.<span style="color: #006633;">z</span><span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>
<span style="color: #009900;">}</span>

<span style="font-weight: bold; color: #000000;">class</span> Dot3D <span style="color: #009900;">{</span>
	<span style="font-style: italic; color: #666666;">// Properties || Dimentions</span>
	<span style="font-weight: bold; color: #000000;">private</span> <span style="font-weight: bold; color: #000066;">int</span> pX<span style="color: #339933;">=</span><span style="color: #cc66cc;">0</span>, pY<span style="color: #339933;">=</span><span style="color: #cc66cc;">0</span>, pZ<span style="color: #339933;">=</span><span style="color: #cc66cc;">0</span><span style="color: #339933;">;</span>

	<span style="font-style: italic; color: #666666;">// Setter's</span>
	<span style="font-weight: bold; color: #000000;">public</span> Dot3D x<span style="color: #009900;">(</span><span style="font-weight: bold; color: #000066;">int</span> val<span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		pX <span style="color: #339933;">=</span> val<span style="color: #339933;">;</span>
		<span style="font-weight: bold; color: #000000;">return</span> <span style="font-weight: bold; color: #000000;">this</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>

	<span style="font-weight: bold; color: #000000;">public</span> Dot3D y<span style="color: #009900;">(</span><span style="font-weight: bold; color: #000066;">int</span> val<span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		pY <span style="color: #339933;">=</span> val<span style="color: #339933;">;</span>
		<span style="font-weight: bold; color: #000000;">return</span> <span style="font-weight: bold; color: #000000;">this</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>

	<span style="font-weight: bold; color: #000000;">public</span> Dot3D z<span style="color: #009900;">(</span><span style="font-weight: bold; color: #000066;">int</span> val<span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		pZ <span style="color: #339933;">=</span> val<span style="color: #339933;">;</span>
		<span style="font-weight: bold; color: #000000;">return</span> <span style="font-weight: bold; color: #000000;">this</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>

	<span style="font-style: italic; color: #666666;">// Getter's</span>
	<span style="font-weight: bold; color: #000000;">public</span> <span style="font-weight: bold; color: #000066;">int</span> x<span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		<span style="font-weight: bold; color: #000000;">return</span> pX<span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>

	<span style="font-weight: bold; color: #000000;">public</span> <span style="font-weight: bold; color: #000066;">int</span> y<span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		<span style="font-weight: bold; color: #000000;">return</span> pY<span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>

	<span style="font-weight: bold; color: #000000;">public</span> <span style="font-weight: bold; color: #000066;">int</span> z<span style="color: #009900;">(</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		<span style="font-weight: bold; color: #000000;">return</span> pZ<span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>

<span style="color: #009900;">}</span>

<span style="font-style: italic; color: #666666;">/*
// OLD WAY TO SET, GET!
// Set values
someDot.setX(10);
someDot.setY(13);
someDot.setZ(48);

// Print them
System.out.println("X: " + someDot.getX() + ", Y: "
<span>    </span><span>    </span><span>    </span><span>    </span><span>    </span>+ someDot.getY() + ", Z: " + someDot.getZ() ); 

*/</span></pre>
<p>------------------------------</p>
<p>أو حمل الكود بملف جافا من هنا  <strong><a href="http://www.omardo.com/blog/wp-content/uploads/bettergetterandsetter.java">BetterGetterAndSetter.java</a></strong></p>
