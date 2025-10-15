---
layout: post
status: publish
published: true
title: "لمسة جميلة بالـ CSS، أيقونة لإنتظار تحميل للصورة الكبيرة!"
author:
  display_name: "عمر العيثاوي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 429
wordpress_url: http://www.omardo.com/blog/?p=429
date: '2008-10-02 23:20:09 +0000'
date_gmt: '2008-10-02 21:20:09 +0000'
---
<p>فكرت بهذه الطريقة منذ فترة، ورأيتها في أكثر من موقع منذ مدة، ولا أدري بالضبط كيفية عملها فلم أحاول أن أفتح مصدر الصفحات وأنظر الطريقة، بل فضلت أن أعمل ذلك بنفسي.</p>
<p>الغرض من هذه الطريقة هو وضع أيقونة تشير إلى أن الصورة جاري تحميلها. والفائدة من ذلك أن لا يشعر المتصفح بالملل أثناء مشاهدة الصفحة. بل يرى فيها نوعاً من الحياة :).</p>
<p>مثال على تطبيق الدرس لفهم المطلوب:<!--more--></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/css_image_loading.html">مثال للدرس: تحميل الصورة الكبيرة بأيقونة بالخلفية</a></p>
<h2 style="text-align: right;"><span style="color: #333333;">خطوات الدرس</span></h2>
<p>أولاً جهز ملف html، وأجعل محتواه كالتالي (<span style="color: #3366ff;"><strong>ملاحظة أنصحكم بإستعمال محرر Aptana وهو شغال على وندوز ولكن الأفضل إستخدامه مع أوبونتو/لينوكس</strong></span>):</p>
<pre class="php"><span style="color: #339933;">&lt;</span>?xml version<span style="color: #339933;">=</span><span style="color: #0000ff;">"1.0"</span> encoding<span style="color: #339933;">=</span><span style="color: #0000ff;">"utf-8"</span><span style="font-weight: bold; color: #000000;">?&gt;</span>
 <span style="color: #339933;">&lt;!</span>DOCTYPE html <span style="font-weight: bold; color: #000000;">PUBLIC</span> <span style="color: #0000ff;">"-//W3C//DTD XHTML 1.0 Strict//EN"</span> <span style="color: #0000ff;">"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"</span><span style="color: #339933;">&gt;</span>
<span style="color: #339933;">&lt;</span>html xmlns<span style="color: #339933;">=</span><span style="color: #0000ff;">"http://www.w3.org/1999/xhtml"</span><span style="color: #339933;">&gt;</span>
    <span style="color: #339933;">&lt;</span>head<span style="color: #339933;">&gt;</span>
        <span style="color: #339933;">&lt;</span>meta http<span style="color: #339933;">-</span>equiv<span style="color: #339933;">=</span><span style="color: #0000ff;">"Content-Type"</span> content<span style="color: #339933;">=</span><span style="color: #0000ff;">"text/html; charset=utf-8"</span> <span style="color: #339933;">/&gt;</span>
        <span style="color: #339933;">&lt;</span>title<span style="color: #339933;">&gt;</span>CSS Image Loading<span style="color: #339933;">&lt;/</span>title<span style="color: #339933;">&gt;</span>
        <span style="color: #339933;">&lt;</span>style type<span style="color: #339933;">=</span><span style="color: #0000ff;">"text/css"</span><span style="color: #339933;">&gt;</span>
        <span style="color: #339933;">&lt;/</span>style<span style="color: #339933;">&gt;</span>
    <span style="color: #339933;">&lt;/</span>head<span style="color: #339933;">&gt;</span>
    <span style="color: #339933;">&lt;</span>body<span style="color: #339933;">&gt;</span>
    <span style="color: #339933;">&lt;/</span>body<span style="color: #339933;">&gt;</span>
<span style="color: #339933;">&lt;/</span>html<span style="color: #339933;">&gt;</span></pre>
<p>وهو محتوى قياسي لملف xhtml-strict فارغ.</p>
<p>وبعدها أكتب الكود التالي داخل وسم &lt;<strong>body</strong>&gt;:</p>
<pre class="php"><span style="color: #339933;">&lt;</span>img src<span style="color: #339933;">=</span><span style="color: #0000ff;">"Wellcome-vacation.png"</span> alt<span style="color: #339933;">=</span><span style="color: #0000ff;">"صورة"</span> width<span style="color: #339933;">=</span><span style="color: #0000ff;">"200"</span> height<span style="color: #339933;">=</span><span style="color: #0000ff;">"200"</span> <span style="font-weight: bold; color: #000000;">class</span><span style="color: #339933;">=</span><span style="color: #0000ff;">"loading"</span> <span style="color: #339933;">/&gt;</span></pre>
<p>ولا تنسى أن تغير الخصائص تبعاً للصورة عندك ولا تنسى أن تحتفظ بالقيمة class=loading كما هي، لأننا سنستخدمها لاحقاً.</p>
<p>الأمر الأخير وهو المهم:</p>
<p>أضف التالي داخل وسم وهو المسؤول عن عمل التأثير المطلوب &lt;<strong>style</strong>&gt;:</p>
<pre class="css"><span style="color: #6666ff;">.loading</span> <span style="color: #66cc66;">{</span>
    <span style="font-weight: bold; color: #000000;">background</span><span style="color: #66cc66;">:</span> <span style="color: #cc00cc;">#fff</span> <span style="color: #993333;">url</span><span style="color: #66cc66;">(</span><span style="color: #993333;">bigrotation2<span style="color: #6666ff;">.gif</span></span><span style="color: #66cc66;">)</span> <span style="color: #993333;">center</span> <span style="color: #993333;">no-repeat</span><span style="color: #66cc66;">;</span>
    <span style="font-weight: bold; color: #000000;">display</span><span style="color: #66cc66;">:</span> inline-<span style="color: #993333;">block</span><span style="color: #66cc66;">;</span>
    <span style="color: #66cc66;">}</span></pre>
<p>أو تستطيع أن تعمل التالي لتحصل على نتيجة كما في المثال (لمسات جمالية فقط) الذي عملته، مع ملاحظة أن الكود يحتوي على ملاحظات تستحق أن تعير إنتباهك لها!:</p>
<pre class="css"><span style="color: #6666ff;">.loading</span> <span style="color: #66cc66;">{</span>
	<span style="font-style: italic; color: #808080;">/* importanat */</span>
	<span style="font-weight: bold; color: #000000;">background</span><span style="color: #66cc66;">:</span> <span style="color: #cc00cc;">#fff</span> <span style="color: #993333;">url</span><span style="color: #66cc66;">(</span><span style="color: #993333;">bigrotation2<span style="color: #6666ff;">.gif</span></span><span style="color: #66cc66;">)</span> <span style="color: #993333;">center</span> <span style="color: #993333;">no-repeat</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">display</span><span style="color: #66cc66;">:</span> inline-<span style="color: #993333;">block</span><span style="color: #66cc66;">;</span>

	<span style="font-style: italic; color: #808080;">/* very useful */</span>
	<span style="font-weight: bold; color: #000000;">font-weight</span><span style="color: #66cc66;">:</span> <span style="color: #993333;">bold</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">text-align</span><span style="color: #66cc66;">:</span> <span style="color: #993333;">center</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">vertical-align</span><span style="color: #66cc66;">:</span> text-<span style="font-weight: bold; color: #000000;">bottom</span><span style="color: #66cc66;">;</span>

	<span style="font-style: italic; color: #808080;">/* just colors and cool stuff */</span>
	<span style="font-weight: bold; color: #000000;">border</span><span style="color: #66cc66;">:</span> <span style="color: #993333;">2px</span> <span style="color: #993333;">solid</span> <span style="color: #cc00cc;">#cc9966</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">margin</span><span style="color: #66cc66;">:</span> <span style="color: #993333;">2px</span><span style="color: #66cc66;">;</span>
	<span style="font-weight: bold; color: #000000;">color</span><span style="color: #66cc66;">:</span> <span style="color: #cc00cc;">#<span style="color: #993333;">000033</span></span><span style="color: #66cc66;">;</span>
	<span style="color: #66cc66;">}</span></pre>
<p style="text-align: center;">مع التأكيد على الإنتباه أن الصورة <strong>bigrotation2.gif</strong> يجب أن تكون متوفرة، ولديك الخيار أن تستبدلها بإحدى الصور التالية، مع ملاحظة أنها منشورة تحت الترخيص<br />
<a rel="license" href="http://creativecommons.org/licenses/by/3.0/"><img style="border-width:0" src="http://i.creativecommons.org/l/by/3.0/88x31.png" alt="Creative Commons License" /></a><br />
<a rel="license" href="http://creativecommons.org/licenses/by/3.0/">Creative Commons Attribution 3.0 Unported License</a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/black_busy.gif"><img class="alignnone" title="صورة تحميل كبيرة" src="http://www.omardo.com/css_image_loader/bigrotation2.gif" alt="صورة تحميل كبيرة" width="32" height="32" /><br />
</a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/green_rot.gif"><img class="alignnone" title="دائرة خضراء" src="http://www.omardo.com/css_image_loader/green_rot.gif" alt="" width="24" height="24" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/mozilla_giallo.gif"><img class="alignnone" title="دائرة ذهبية" src="http://www.omardo.com/css_image_loader/mozilla_giallo.gif" alt="" width="16" height="16" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/mozilla_blu.gif"><img class="alignnone" title="دائرة زرقاء" src="http://www.omardo.com/css_image_loader/mozilla_blu.gif" alt="" width="16" height="16" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/remembermilk_orange.gif"><img class="alignnone" title="دائرة برتقالي" src="http://www.omardo.com/css_image_loader/remembermilk_orange.gif" alt="" width="20" height="20" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/rotating_arrow.gif"><img class="alignnone" title="أسهم دوارة" src="http://www.omardo.com/css_image_loader/rotating_arrow.gif" alt="" width="20" height="21" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/tiny_red.gif"><img class="alignnone" title="دائرة صغيرة" src="http://www.omardo.com/css_image_loader/tiny_red.gif" alt="" width="10" height="10" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/black_busy.gif"><img class="alignnone" title="أسود، مشغول" src="http://www.omardo.com/css_image_loader/black_busy.gif" alt="" width="40" height="10" /></a></p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/gray_busy.gif"><img class="alignnone" title="مشغول، رمادي" src="http://www.omardo.com/css_image_loader/gray_busy.gif" alt="" width="29" height="5" /></a></p>
<p style="text-align: center;">
<p style="text-align: center;">إنتهى الدرس، وإن كنت نسيت أن تشاهد المثال: شاهده مرة أخرى:</p>
<p style="text-align: center;"><a href="http://www.omardo.com/css_image_loader/css_image_loading.html">مثال للدرس: تحميل الصورة الكبيرة بأيقونة بالخلفية</a></p>
<h2 style="text-align: center;">التوافقية</h2>
<p>هذا الدرس يوفر لك نتيجة ناجحة مع المتصفحات التالية، بغض النظر عن بعض الفروقات البسيطة:</p>
<p style="text-align: center;">Firefox <strong>3</strong><br />
Internet Explorer <strong>6</strong><br />
Internet Explorer <strong>7</strong><br />
Opera <strong>9</strong></p>
<h3 style="text-align: center;">- ملاحظات -</h3>
<ul>
<li> <span style="font-size: medium;">الكاتب:</span> عمر العيثاوي, <a id="u7ye" title="http://www.omardo.com" href="../../">http://www.omardo.com</a></li>
<li><span style="font-size: medium;">الدرس</span> منشور في أماكن أخرى، وأنا صاحب الحقوق.</li>
<li> <span style="font-size: medium;">الترخيص</span><span style="font-size: small;">:</span> <strong><a id="f2d-" title="Creative Commons 3.0 - by-sa" href="http://creativecommons.org/licenses/by-sa/3.0/">Creative Commons 3.0 - by-sa</a></strong> <span style="font-size: small;"><strong style="color: #666666;"><br />
</strong></span></li>
<li> <span style="font-size: medium;">للإتصال</span>: أرحب بكافة الملاحظات والنصائح حول ما أكتب:  <strong><a id="l4y1" title="إتصل بي" href="../contact-me">إتصل بي</a></strong></li>
</ul>
