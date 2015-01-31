---
layout: post
status: publish
published: true
title: "جريمة بالـPHP. وبطاقتي الشخصية بالـ CSS"
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 327
wordpress_url: http://www.omardo.com/blog/?p=327
date: '2008-09-14 06:51:57 +0000'
date_gmt: '2008-09-14 04:51:57 +0000'
---
<p>فكرت بخطة غريبة لتنفيذ جريمة بواسطة php. <strong>أرجوا أن لا ينفذها أحد ويلومني</strong> :(. فالكود فقط للإطلاع!:</p>
<pre class="php" dir="ltr"><span style="font-weight: bold; color: #000000;">&lt;?php</span>
<span style="font-weight: bold; color: #000000;">function</span> kill<span style="color: #009900;">(</span><span style="color: #000033;">$victims</span><span style="color: #339933;">,</span> <span style="color: #000033;">$frequency</span><span style="color: #339933;">=</span><span style="color: #0000ff;">'once'</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span><!--more-->
	<span style="color: #b1b100;">foreach</span><span style="color: #009900;">(</span><span style="color: #000033;">$victims</span> <span style="color: #b1b100;">as</span> <span style="color: #000033;">$victim</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		<a href="http://www.php.net/die"><span style="color: #990000;">die</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$victim</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
		<a href="http://www.php.net/sleep"><span style="color: #990000;">sleep</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$frequency</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>
<span style="color: #009900;">}</span>
<span style="color: #000033;">$bank</span> <span style="color: #339933;">=</span> <a href="http://www.php.net/mysql_fetch_object"><span style="color: #990000;">mysql_fetch_object</span></a><span style="color: #009900;">(</span>
			<a href="http://www.php.net/mysql_query"><span style="color: #990000;">mysql_query</span></a><span style="color: #009900;">(</span><span style="color: #0000ff;">"ENTER `bank` WHERE `jewels`='lot';"</span><span style="color: #009900;">)</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
<span style="color: #b1b100;">if</span><span style="color: #009900;">(</span><a href="http://www.php.net/empty"><span style="color: #990000;">empty</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$bank</span><span style="color: #009900;">)</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
<span style="color: #009900;">}</span> <span style="color: #b1b100;">elseif</span><span style="color: #009900;">(</span><a href="http://www.php.net/isset"><span style="color: #990000;">isset</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$guard</span><span style="color: #009900;">)</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
	tie_up<span style="color: #009900;">(</span><span style="color: #000033;">$guard</span><span style="color: #339933;">,</span> <span style="color: #0000ff;">'well'</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<span style="color: #b1b100;">if</span><span style="color: #009900;">(</span><span style="color: #339933;">!</span><span style="color: #000033;">$guard</span><span style="color: #339933;">-&gt;</span><span style="color: #004000;">mouth</span> <span style="color: #339933;">==</span> <span style="color: #0000ff;">'Shut up'</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
		kick<span style="color: #009900;">(</span><span style="color: #000033;">$guard</span><span style="color: #009900;">)</span> or kill<span style="color: #009900;">(</span><span style="color: #0000ff;">'I`m sorry'</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<span style="color: #009900;">}</span>
<span style="color: #009900;">}</span> <span style="color: #b1b100;">elseif</span><span style="color: #009900;">(</span><a href="http://www.php.net/isset"><span style="color: #990000;">isset</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$people</span><span style="color: #009900;">)</span><span style="color: #009900;">)</span> <span style="color: #009900;">{</span>
	make_hostage<span style="color: #009900;">(</span><span style="color: #000033;">$people</span><span style="color: #339933;">,</span> <span style="color: #000033;">$bank</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	take<span style="color: #009900;">(</span><a href="http://www.php.net/array"><span style="color: #990000;">array</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$money</span><span style="color: #339933;">,</span> <span style="color: #000033;">$fast_car</span><span style="color: #009900;">)</span><span style="color: #009900;">)</span> or kill<span style="color: #009900;">(</span><span style="color: #000033;">$hostage</span><span style="color: #339933;">,</span> <span style="color: #0000ff;">'every_minute'</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
<span style="color: #009900;">}</span>
<a href="http://www.php.net/echo"><span style="color: #990000;">echo</span></a> <span style="color: #0000ff;">'Success'</span> or <a href="http://www.php.net/die"><span style="color: #990000;">die</span></a><span style="color: #009900;">(</span><span style="color: #0000ff;">'Injuries'</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
<span style="font-weight: bold; color: #000000;">?&gt;</span></pre>
<p>ونأتي لبطاقتي الشخصية فقد صممتها مؤخراً بالـCSS. وأرجوا أن تفهموها :P. لكن للأسف. أنها لا تتبع معايير W3C. سأرفع لهم شكوى :P.</p>
<pre class="css" style="text-align: left;" dir="ltr"><span style="color: #cc00cc;">#Omar</span> <span style="color: #66cc66;">{</span>
	<span style="font-weight: bold; color: #000000;">height</span><span style="color: #66cc66;">:</span><span style="color: #3333ff;"> </span><span style="color: #3333ff;">1</span><span style="color: #6666ff;">.87m</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">width</span><span style="color: #66cc66;">:</span> <span style="color: #3333ff;">40cm</span><span style="color: #66cc66;">;</span>
	<strong>weight</strong><span style="color: #66cc66;">:</span>  <span style="color: #3333ff;">96kg</span><span style="color: #66cc66;">;</span>
	<strong>age</strong><span style="color: #66cc66;">:</span> <span style="color: #3333ff;">18yr</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">size</span><span style="color: #3333ff;">:big</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">z-index</span><span style="color: #3333ff;">:<span style="color: #3333ff;">2</span></span><span style="color: #66cc66;">;</span>

	<span style="font-weight: bold; color: #000000;">color</span><span style="color: #66cc66;">:</span> <span style="color: #993300;"><strong>light-brown</strong></span><span style="color: #66cc66;">;</span>
	<strong>hair</strong><span style="color: #66cc66;">:</span> <span style="color: #3333ff;">1cm</span> <span style="color: #333300;"><strong>half-smooth</strong></span> <span style="font-weight: bold; color: #993300;">black</span><span style="color: #66cc66;">;</span>
	<strong>eyes</strong><span style="color: #66cc66;">:</span> <strong><span style="color: #993300;">dark-brown</span></strong><span style="color: #66cc66;">;</span>

	<strong>high-school-rate</strong><span style="color: #66cc66;">:</span> <span style="color: #3333ff;">76</span><span style="color: #3333ff;">.<span>6</span></span><span style="color: #3333ff;">%</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">speak</span><span style="color: #66cc66;">:</span> <strong><span style="color: #333300;">english</span></strong>, <strong><span style="color: #333300;">arabic</span></strong><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">content</span><span style="color: #66cc66;">:</span> <strong><span style="color: #333300;">brain</span></strong><span style="color: #66cc66;">;</span>

	<span style="font-weight: bold; color: #000000;">richness</span><span style="color: #66cc66;">:</span> <span style="color: #993333;">normal</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">background</span><span style="color: #66cc66;">:</span> muslim<span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">display</span><span style="color: #66cc66;">:</span> simple<span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">position</span><span style="color: #66cc66;">:</span> website-developer<span style="color: #66cc66;">;</span>
<span style="color: #66cc66;">}
</span></pre>
<p style="text-align: center;">تقبلوا تحيتي :). وأعذروني فاللغة إنجليزية هنا :D. لأن البرمجة كذلك (أو على الأقل في الوقت الراهن ^^).</p>
