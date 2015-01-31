---
layout: post
status: publish
published: true
title: "تثبيت CakePHP على Ubuntu 8.04. خطوة خطوة "
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 396
wordpress_url: http://www.omardo.com/blog/?p=396
date: '2008-09-28 08:46:55 +0000'
date_gmt: '2008-09-28 06:46:55 +0000'
---
<h3><span style="color: #808080;">بداية<br />
</span></h3>
<div style="text-align: justify;">هذا التدريب مدعوم على إفتراض أن المستخدم قد ركب <strong>XAMPP on Linux </strong>من خلال الدليل التالي. وغير ذلك ربما يعمل ولكن غير مضمون.<br />
والدليل هو بعنوان "<strong><a id="o-1y" title="الدليل المفصل: تركيب وإعداد السيرفر المحلي على أوبونتو XAMPP" href="../archives/360">الدليل المفصل: تركيب وإعداد السيرفر المحلي على أوبونتو XAMPP</a> </strong>" يوفر لك تدريب مفصل ومعلومات مفيدة ومهارات مطلوبة جداً للتعامل مع السيرفر المحلي لمطوري الويب.</div>
<h2><span style="color: #808080;">أول الخطوات</span></h2>
<p><span style="font-size: medium;">أنشيء قاعدة البيانات!</span> <span style="color: #38761d;"><strong>س:</strong> لم هذه في البداية؟ <strong>ج:</strong> ليس أمر مهماً. إفعل الخطوات بارك الله فيك :).<br />
</span><!--more--></p>
<ol>
<li>إفتح المتصفح على الرابط التالي: <a id="admn" title="http://localhost/phpmyadmin/" href="http://localhost/phpmyadmin/">http://localhost/phpmyadmin/</a>.</li>
<li>أنشيء قاعدة بيانات جديدة وسمها، مثلا: "cakephp"، بنوع الترميز (بالإنجليزية: <strong>Collation</strong>) التالي:<br />
<strong><code>utf8_unicode_ci</code></strong></li>
<li>إتركها فارغة حالياً لا يهم!</li>
</ol>
<h2><span style="font-size: medium;">البدء بالعمل</span></h2>
<p><span style="font-size: medium;">حمل الكيك،</span> في وقت كتابة هذا التدريب، الإصدار  1.2.0.7296rc2 هو المتوفر حالياً.</p>
<ol>
<li style="text-align: justify;">إذهب إلى هذا الرابط : <a id="nl2o" title="CakePHP Downloads" href="http://cakephp.org/downloads">CakePHP Downloads</a>.</li>
<li style="text-align: justify;">ستجد مجموعة روابط, لك الخيار أن تختار من بين:
<ul>
<li>كتب PDF صغيرة عادةً ثلاثة كتب.</li>
<li><strong>ورابطين بالأسفل لنسخ CakePHP المتوفرة. أنا أخترت هذا اليوم (21-8-2008). الإصدار 1.2.0.7296rc2.</strong></li>
<li><strong>وعند تنزيل</strong> أحد الإصدارات ستخرج لك نافذة يخيرك بين التبرع للمشروع أو لا. أختر<strong> أي</strong> الخيارين حسب رغبتك ليتم تحميل الملف.</li>
</ul>
</li>
<li style="text-align: justify;">إفتح مدير الملفات وأذهب إلى المجلد،<br />
<code>/opt/lampp/htdocs</code> أنشيء مجلدا داخله وسمّه '<strong>cakephp</strong>'، <strong>إفتح</strong> هذا المجلد.</li>
<li style="text-align: justify;"><a href="http://www.omardo.com/blog/wp-content/uploads/cake-php-file-s.png"><img class="alignleft size-full wp-image-398" style="margin: 3px;" title="cake-php-file-s" src="http://www.omardo.com/blog/wp-content/uploads/cake-php-file-s.png" alt="" width="94" height="223" /></a>إفتح الملف المضغوط الذي حملته من الموقع، في هذه الحالة عندي '<strong><a id="exys" title="cake_1.2.0.7296-rc2.tar.bz2" href="http://cakeforge.org/frs/download.php/637/cake_1.2.0.7296-rc2.tar.bz2">cake_1.2.0.7296-rc2.tar.bz2</a></strong>'.<br />
سيُفتح لك مدير الملفات المضغوطة، أدخل أول مجلد يصادفك "cake_1.2.0.7296-rc2"، وثم حدد المحتويات أمامك (عادةً 4 مجلدات وملفين)<br />
وفك ضغطه في المجلد  '<strong>cakephp</strong>' أي في المسار:<br />
<code>/opt/lampp/htdocs/cakephp/</code></li>
<li style="text-align: justify;">نفذ الأمر التالي، في سطر الأوامر:<br />
<code>chmod -R 777 /opt/lampp/htdocs/cakephp/app/tmp</code></li>
<li style="text-align: justify;">نفذ الأمر التالي في سطر الأوامر، (نسخ ملف):<br />
<code>cp /opt/lampp/htdocs/cakephp/app/config/database.php.default /opt/lampp/htdocs/cakephp/app/config/database.php</code></li>
<li style="text-align: justify;">حرر الملف المسمى "database.php" الموجود في المجلد:<br />
<code>/opt/lampp/htdocs/cakephp/app/config/</code></li>
<li style="text-align: justify;">أدخل فيه القيم، وحسب المبين:
<pre class="php"><span style="color: #000000;"><strong>var</strong></span> <span style="color: #000033;">$default</span> <span style="color: #339933;">=</span> <a href="http://www.php.net/array"><span style="color: #990000;">array</span></a><span style="color: #009900;">(</span>
	<span style="color: #0000ff;">'driver'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #0000ff;">'mysql'</span><span style="color: #339933;">,</span>
	<span style="color: #0000ff;">'persistent'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #000000;"><strong>false</strong></span><span style="color: #339933;">,</span>
	<span style="color: #0000ff;">'host'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #0000ff;">'localhost'</span><span style="color: #339933;">,</span>
	<span style="color: #0000ff;">'login'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #0000ff;">'<strong>user</strong>'</span><span style="color: #339933;">,</span>
	<span style="color: #0000ff;">'password'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #0000ff;">'<strong>password</strong>'</span><span style="color: #339933;">,</span>
	<span style="color: #0000ff;">'database'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #0000ff;">'<strong>database_name</strong>'</span><span style="color: #339933;">,</span>
	<span style="color: #0000ff;">'prefix'</span> <span style="color: #339933;">=&gt;</span> <span style="color: #0000ff;">''</span><span style="color: #339933;">,</span>
<span style="color: #009900;">)</span><span style="color: #339933;">;</span></pre>
<p>ما يجب عليك أن تغيره حالياً (لأنك تعمل على الخادم المحلي) هو:<br />
<strong>login</strong> غيره من user إلى root<br />
<strong>password</strong> غيرها إلى كلمة سر قواعد البيانات<br />
<strong>database</strong> غيرها إلى إسم قاعدة البيانات (حاليا أسميناها <strong>cakephp</strong>).</li>
<li style="text-align: justify;">حرر الملف المسمى "core.php" الموجود في المجلد:<br />
<code>/opt/lampp/htdocs/cakephp/app/config/</code></li>
<li style="text-align: justify;">إبحث عن متغير إسمه "Security.salt" غير قيمتة (عادة تكون "DYhG93b0qyJfIxfs2....." إلى أي قيمة مشابهة) إلى أي أحرف وأرقام تختلف عن الموجود.</li>
<li style="text-align: justify;">إفتح المتصفح على العنوان:
<div style="text-align: center;"><a id="dvd3" title="http://www.somesite.com/cakephp/" href="http://www.somesite.com/cakephp/">http://www.somesite.com/cakephp/</a></div>
</li>
<li style="text-align: right;">والمفروض أن ترى أربعة مربعات خضر (<strong>كما في الصورة تحت</strong>) تشير إلى تمام العملية، أي خطأ يحصل في التطبيق قد يسبب ظهور علامة خطأ. حاول أن تعرف مسبب الخطأ وأن تصححه.<br />
<a href="http://www.omardo.com/blog/wp-content/uploads/cake-success.png"><img class="aligncenter size-full wp-image-400" title="cake-success" src="http://www.omardo.com/blog/wp-content/uploads/cake-success.png" alt="" width="353" height="257" /></a></li>
</ol>
<h2>تشغيل Cake PHP Command Line Interface</h2>
<p>هذه الخطوة مهمة ويستفاد منها في عمل الكثير من العمليات على <strong>الكيك php</strong>. فسترى في التدريبات خطوات مهمة تعتمد عليها ولا يتم عمل أي تطبيق بدونها، غالباً. وهي واجهة نصية تعتمد سطر الأوامر لإدارة cakePHP.</p>
<ol>
<li>إضغط مفتاح "<strong>Atl+F2</strong>"</li>
<li>أكتب التالي:
<div><code><strong style="font-weight: normal;">gksudo gedit /etc/environment</strong><br />
</code></div>
<p>وأكتب كلمة السر، سيفتح لك محرر النصوص العادي. بملف محتواه مشابه لهذا المحتوى (الألوان للشرح فقط):</p>
<div><code><span style="color: #783f04;"><strong>PATH</strong>="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/opt/lampp/bin"</span><br />
LANGUAGE="en_US:en"<br />
LANG="en_US.UTF-8"</code></div>
</li>
<li>ما يهمنا هو المتغير <strong>PATH</strong>، سنضيف له (داخل الإقتباس) في نهايته هذا المحتوى:
<div><code>:/opt/lampp/bin<br />
</code></div>
</li>
<li>فيصبح<strong> كما في مثالنا: </strong>
<div><code> <span style="color: #783f04;"><strong>PATH</strong>="usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games<strong style="font-weight: normal;">:/opt/lampp/bin</strong><strong style="color: #0000ff;">:/opt/lampp/htdocs/cakephp/cake/console</strong><span style="color: #0000ff;">"</span></span><br />
LANGUAGE="en_US:en"<br />
LANG="en_US.UTF-8"</code></div>
</li>
<li>إحفظ الملف.</li>
<li>إضغط مفتاح "Atl+F2" وأكتب التالي <strong>أو</strong> أكتبه في سطر الأوامر Termianl
<div><code>. /etc/environment<br />
</code></div>
</li>
</ol>
<p><span style="font-size: large;"><br />
<span style="font-size: medium;">لإختبار cakePHP Console.</span></span> جرب الأمر التالي في سطر الأوامر، مع ملاحظة أن لتجريب سطر الأوامر يجب أن تكون في المجلد "app" لا غيره.</p>
<div><code>cd /opt/lampp/htdocs/cakephp/app/<br />
cake console<br />
</code></div>
<p>يجب سيكون المخرج مشابهاً لهذا:</p>
<div><code>Model classes:<br />
--------------</code></p>
<p>Welcome to CakePHP v1.2.0.7296 RC2 Console<br />
---------------------------------------------------------------<br />
App : app<br />
Path: /opt/lampp/htdocs/cakephp/app<br />
---------------------------------------------------------------</p>
<p>&gt;</p></div>
<p>لن نتطرق الآن لكيفية إستخدام الكونسول، يكفي أنك نجحت في تشغيله.</p>
<div style="text-align: right;">
<h1>عن المستند</h1>
<p><span style="font-size: medium;">الكاتب:</span> عمر الدليمي, <a id="u7ye" title="http://www.omardo.com" href="../../">http://www.omardo.com</a><br />
<span style="font-size: medium;">للإتصال</span>: أرحب بكافة الملاحظات والنصائح حول ما أكتب:  <strong><a id="l4y1" title="إتصل بي" href="../contact-me">إتصل بي</a></strong><br />
<span style="font-size: small;">الترخيص:</span> <strong><a id="f2d-" title="Creative Commons 3.0 - by-sa" href="http://creativecommons.org/licenses/by-sa/3.0/">Creative Commons 3.0 - by-sa</a></strong></div>
