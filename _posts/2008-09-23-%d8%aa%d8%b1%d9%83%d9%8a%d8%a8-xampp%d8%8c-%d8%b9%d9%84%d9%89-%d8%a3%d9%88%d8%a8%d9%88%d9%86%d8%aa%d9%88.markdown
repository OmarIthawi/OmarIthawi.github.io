---
layout: post
status: publish
published: true
title: "الدليل المفصل: تركيب وإعداد السيرفر المحلي على أوبونتو"
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 360
wordpress_url: http://www.omardo.com/blog/?p=360
date: '2008-09-23 09:24:15 +0000'
date_gmt: '2008-09-23 07:24:15 +0000'
---
<p style="text-align: center;"><span style="font-size:1.5em"><span style="text-align: center;"><span style="color: #e69138;"><strong>XAMPP for Linux</strong></span><strong> <span style="color: #cc0000;">on</span> <span style="color: #ff9900;">Ubuntu</span></strong></span></span></p>
<p><strong>مقدمة:</strong> يعتبر السيرفر المحلي من أساسيات نظام تشغيل أي مطور, مصمم, مبرمج و حتى أي شخص يملك موقع أو يعمل على ادارته فمن غير المعقول كلما احتاج هذا الشخص أن يعدل على شيء في موقعه أو عند الرغبة في تركيب الاضافات والهاكات أن يبدأ التطبيق المباشر على الموقع لأن في حال حدوث أي خطأ سيسبب له مشاكل كبيرة في الموقع, غير الصعوبة التي سيواجهها في رفع الملفات ثم اعادة تنزيل ملف و تعديله ليعود لرفعه مرة أخرى للموقع.</p>
<div style="text-align: justify;"><strong>ميزات السيرفر:</strong> أما السيرفر المحلي يوفر عليك كل ذلك العناء فأنت لست بحاجة لأن تكون خبير في ادارة السيرفرات لتجعل من جهازك سيرفر تختبر عليه موقعك أو أي سكريبت تريد ان كان ذلك السكريبت مدونة, منتدى أو حتى موقع كامل وليس عليك الدخول في متاهات وطرق تركيب الـ <span style="color: #444444;"><strong>apache</strong>, <strong>php</strong>, <strong>perl</strong>, <strong>mysql</strong> </span>وباقي خدمات السيرفر الأخرى, فالسيرفر المحلي يوفر عليك كل هذه البرامج مجموعة معا في برنامج سهل التنصيب والاستعمال <!--more-->تجعل من جهازك سيرفر تستطيع أن تشغل عليه أي موقع مثله مثل أي سيرفر آخر و يعتبر<span style="color: #999999;"> <strong><span style="color: #444444;">XAMPP</span></strong></span> أحد أفضل السيرفرات المحلية فهو سهل الاستعمال و قوي في الوقت نفسه, يعمل على أكثر من نظام تشغيل <strong style="color: #444444;">Windows, Linux, Mac, Solaris</strong> و له لوحة تحكم جميلة بسيطة سهلة الاستعمال و يتضمن كل ماتحتاجه من خدمات و أدوات تجعل استخدام السيرفر أكثر سهولة و توفر عليك الوقت والجهد.</div>
<h2>يشمل المشروع هذه الأدوات والحزم التالية</h2>
<p><strong>إسم الحزمة:</strong> xampp-linux، <strong>الإصدار:</strong> 1.6.7</p>
<div style="text-align: left;">
<pre><span style="font-size: xx-small;"><strong>Apache</strong>,		MySQL
PHP &amp; PEAR,		Perl
ProFTPD,		phpMyAdmin
OpenSSL		GD
Freetype2,		libjpeg
libpng,		gdbm
zlib,		expat
Sablotron,		libxml
Ming,		Webalizer
pdf class,		ncurses
mod_perl,		FreeTDS
gettext,		mcrypt
mhash,		eAccelerator
SQLite and IMAP C-Client

</span></pre>
<div style="text-align: right;">
<h2 style="text-align: right;">طريقة التركيب</h2>
<ol>
<li><strong>حمل الملف المضغوط التالي:</strong><strong><span style="color: #274e13;"><br />
* إصدار السيرفر قد يكون قديم! فالأفضل تحميله من موقع المشروع:</span></strong> "<strong><a id="af:i" title="xampp on sf.net" href="http://sourceforge.net/project/showfiles.php?group_id=61776&amp;package_id=60248">xampp on sf.net</a></strong>".<br />
وأن لم تستطيع التحميل، حمله من هذا الرابط المباشر : <strong><a id="tavj" title="سيرفر xampp." href="http://sourceforge.net/project/downloading.php?group_id=61776&amp;use_mirror=heanet&amp;filename=xampp-linux-1.6.7.tar.gz&amp;2190288">سيرفر xampp.</a></strong></li>
<li>إضغط على "<strong>Alt + F2</strong>". وأكتب الأمر:
<div><code>gksudo nautilus<br />
</code></div>
<p>أكتب كلمة السر وستحصل على صلاحية الجذر في مدير الملفات، إذهب للعنوان التالي:</p>
<div><code>/opt/<br />
</code></div>
<div style="text-align: justify;">الآن، إذهب وأفتح الملف الذي حملته "<strong>xampp-linux-x.x.x.tar.gz</strong>" <strong>وفك ضغطه</strong> على أي مكان مثل سطح المكتب حيث سينتج عن فك الضغط مجلد إسمه '<strong>lampp</strong>' <strong>أنقله</strong> <strong>move</strong> إلى المجلد '<strong>opt</strong>'. وبذلك يكون مجلد ملفات html وغيرها من الملفات الظاهرة في عنوان "http://localhost" هو:</div>
<div><code>/opt/lampp/htdocs/</code></div>
</li>
<li>ستحتاج لتغيير صلاحية بعض الملفات، لأجل الحماية (هي ليست خطير فعلياً لكن السيرفر لن يعمل بشكل جيد بدونها!):<br />
أولاً ملف my.cnf:</p>
<div><code>sudo chmod 755 /opt/lampp/etc/my.cnf<br />
</code></div>
</li>
</ol>
<h2 style="text-align: right;">بعض الإعدادات المفيدة وطريقة تشغيل السيرفر</h2>
<p><strong><span style="font-size: small;"><span style="font-size: small;">طريقة التشغيل</span></span></strong><br />
الطريقة العادية لتشغيل السيرفر هي، من سطر الأوامر (بالأنجليزية: Terminal):</p>
<div>
<div style="text-align: left;"><code>sudo     /opt/lampp/lampp <strong><span style="color: #0000ff;">start </span></strong><br />
</code></div>
</div>
<p><span style="color: #999999;">اللون الأزرق للتنبيه :P. فلن تحتاج لتلوينه عند الكتابة ههه :).</span><br />
وكذلك للقيام ببعض التحوطات الأمنية وتغيير كلمات السر نفذ الأمر التالي:<span style="color: #999999;"> <span style="color: #666666;">(عمل هذا الأمر <strong>مرة واحدة</strong> كافي)</span></span></p>
<div><code>sudo     /opt/lampp/lampp <strong style="color: #0000ff;">security </strong><br />
</code></div>
<p>الأوامر الوسيطة (parameter) المتوفر غير <strong style="color: #0000ff;">start</strong> و <strong><span style="color: #0000ff;">security </span></strong> هي:<br />
<strong style="color: #0000ff;">stop</strong> لإيقاف xampp<br />
<strong style="color: #0000ff;">restart</strong> لإيقاف وتشغيل xampp  (إعادة تشغيل)<br />
<strong style="color: #0000ff;">startapache</strong> لتشغيل <strong>أباتشي</strong> فقط<br />
<strong style="color: #0000ff;">stopapache</strong> لإيقاف <strong>أباتشي</strong> فقط<br />
<strong style="color: #0000ff;">startssl</strong> لتشغيل دعم <strong>SSL</strong><br />
<strong style="color: #0000ff;">stopssl</strong> لإيقاف دعم <strong>SSL</strong><br />
<strong style="color: #0000ff;">startmysql</strong> لتشغيل قواعد بيانات <strong>MySQL</strong> فقط<br />
<strong style="color: #0000ff;">stopmysql</strong> لإيقاف قواعد بيانات <strong>MySQL</strong> فقط<br />
<strong><span style="font-size: small;"><br />
<span style="font-size: small;">إعدادات مفيدة</span></span></strong><br />
<strong style="color: #b45f06;">لعمل إختصار على سطح المكتب لتشغيل السيرفر، إعمل التالي:</strong></p>
<ol>
<li>على سطح المكتب إضغط يمين</li>
<li><strong>Create Luncher</strong></li>
<li>إختر من القائمة المنسدلة <strong>Type: <span style="color: #666666;">Application in Terminal</span>.</strong></li>
<li>إكتب في المربع العلوي <strong>Name</strong> إي إسم، مثلا "xampp start".</li>
<li style="text-align: right;">المربع الأوسط <strong>Command</strong> أكتب به:
<div><code>sudo /opt/lampp/lampp start</code></div>
</li>
<li>ولتغيير الأيقونة إضغط على الزر <strong>المربع على اليسار</strong>، ثم إضغط OK.</li>
<li>إضغط على الأيقونة، ثم أكتب كلمة السر إن طُلبت. وسيتم تشغيل السيرفر ليكون قابلاً للدخول من العنوانين:
<div style="text-align: center;"><a id="wooq" title="http://localhost" href="http://localhost/">http://localhost</a>, <a id="sy9s" title="http://www.somesite.com" href="http://www.somesite.com/">http://www.somesite.com</a></div>
</li>
<li>مبارك عليك :).</li>
</ol>
<p><strong><span style="font-size: small;"><br />
كي ترخص التعديل على المجلد</span></strong> <strong>htdocs</strong> لك، أكتب الأمر التالي في سطر الأوامر (بالأنجليزية: Terminal)ـ</p>
<div><code>sudo chmod -R 777 /opt/lampp/htdocs<br />
</code></div>
</div>
<div style="text-align: right;">
<h2><strong><span style="font-size: small;">خطوة مهمة جداً وكذلك توفر إدارة الخادم من سطر الأوامر<br />
</span></strong></h2>
<p>هذه الخطوة سنقوم بتعيين تطبيقات السيرفر php5-cli وmysql-client والسماح لهم بالتنفيذ من سطر الأوامر كتطبيقات رئيسية:</p>
<ol>
<li>إضغط مفتاح "<strong>Atl+F2</strong>"</li>
<li>أكتب التالي:
<div><code><strong style="font-weight: normal;">gksudo gedit /etc/environment</strong><br />
</code></div>
<p>وأكتب كلمة السر، سيفتح لك محرر النصوص العادي. بملف محتواه مشابه لهذا المحتوى (الألوان للشرح فقط):</p>
<div><code><span style="color: #783f04;"><strong>PATH</strong>="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games"</span><br />
LANGUAGE="en_US:en"<br />
LANG="en_US.UTF-8"</code></div>
</li>
<li>ما يهمنا هو المتغير <strong>PATH</strong>، سنضيف له (داخل الإقتباس) في نهايته هذا المحتوى:
<div><code>:/opt/lampp/bin<br />
</code></div>
</li>
<li>فيصبح<strong> كما في مثالنا:</strong>
<div><code> <span style="color: #783f04;"><strong>PATH</strong>="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games<strong><span style="color: #0000ff;">:/opt/lampp/bin</span></strong>"</span><br />
LANGUAGE="en_US:en"<br />
LANG="en_US.UTF-8"</code></div>
</li>
<li>إحفظ الملف.</li>
<li>إضغط مفتاح "Atl+F2" وأكتب التالي <strong>أو</strong> أكتبه في سطر الأوامر Termianl
<div><code>. /etc/environment<br />
</code></div>
</li>
</ol>
<h2><strong> </strong><strong><span style="font-size: small;">حل مشكلة شائعة لعدم عمل السيرفر،</span></strong></h2>
<p>هذه المشكلة تكون عندما يتضارب خادمين Apache في التشغيل وتكون الأولوية للأول في العمل. فتستطيع إيقاف السيرفر القديم، بالذهاب إلى القائمة العلوية في النظام:</p></div>
<div style="text-align: right;">
<div style="text-align: right;">
<ol>
<li><strong>System -&gt; Administration -&gt; Services</strong></li>
<li>إضغط على زر <span style="text-decoration: underline;"><strong>Unlock</strong></span> وأكتب كلمة السر.</li>
<li>إبحث عن أيقونة إسمها Apache. وإلغي علامة الصح من أمامها ليتم تعطيل الخدمة.
<div style="margin-right: 40px;"><em><strong>إنتهى!<br />
</strong></em></div>
</li>
</ol>
</div>
<h2>تطبيقات إدارة السيرفر، وملفات الإعدادات</h2>
<p>من المهم أن تعرف مسارات ملفات التطبيقات المستخدمة في إدارة السيرفر، مثلاً يوفر لك xampp برنامج phpMyAdmin مركباً بشكل إفتراضي لكن أحيانا بعض العمليات تتطلب الدخول إلى تطبيق mysql بواسطة سطر الأوامر (بالأنجليزية: Terminal)، حسنا هذه المسارات المهمة <strong style="color: #e69138;">(كتبت عناوين المسارات بالإنجليزية لأن من غير المتوقع بشخص يعدلها ولا يعرف ماهي!):</strong></p>
<div>
<div style="text-align: left;">
<div style="text-align: center;"><strong>ملفات الإعدادات<br />
</strong></div>
<p><code> <strong>PHP.ini</strong>:            /opt/lampp/etc/php/ini<br />
<strong>MySQL conf</strong>:         /opt/lampp/etc/my.cnf<br />
<strong>HTTP D Conf</strong>:        /opt/lampp/etc/httpd.conf<br />
<strong>Others</strong>:             /opt/lampp/etc/*<br />
</code></p>
<div style="text-align: center;"><strong>التطبيقات العاملة على سطر الأوامر (المهمة فقط)<br />
</strong></div>
</div>
<div style="text-align: left;"><strong>MySQL:</strong><br />
<span style="text-decoration: underline;">Orginal command:</span><strong> mysql</strong><br />
<span style="color: #999999; text-decoration: underline;">Spare command:</span><span style="color: #999999;"> /opt/lampp/bin/</span><strong><span style="color: #999999;">mysql</span></strong></div>
<div style="text-align: right;"><strong>مثال</strong>, لفتح mysql بصلاحية الجذر [سطر الأوامر (بالأنجليزية: Terminal)]:<br />
تستطيع إستبدال الكلمة <strong style="color: #0000ff;">رووت</strong> بأي إسم مستخدم آخر وتكتب الباسوورد بعد تشغيل الأمر</div>
<div><code><strong>mysql <span style="color: #ff9900;">-u <span style="color: #0000ff;">root</span> -p<br />
</span></strong>use <strong style="color: #0b5394;">test</strong>;<br />
show tables;<br />
exit<br />
</code></div>
<div style="text-align: left;">
<div style="text-align: right;">سيكون الناتج: هو عرض الجداول من قاعدة البيانات <strong style="color: #0b5394;">test</strong></div>
<p><strong>PHP5 Command Line Interface </strong>(php5-cli)<strong>:</strong><br />
<span style="text-decoration: underline;">Orginal command:</span><strong> php<br />
</strong><span style="color: #999999; text-decoration: underline;">Spare command:</span><span style="color: #999999;"> /opt/lampp/bin/</span><strong style="color: #999999;">php</strong></p>
<div style="text-align: right;"><strong>مثال</strong>, لفتح صفحة php5-cli،  [سطر الأوامر (بالأنجليزية: Terminal)]:</p>
<div><code>cd <span style="color: #ff0000;">/opt/lampp/<strong>htdocs</strong>/</span><br />
<strong>php</strong> <strong style="color: #0000ff;">index.html<br />
</strong><strong>php</strong> <strong style="color: #0000ff;">index.php</strong><br />
</code></div>
<p>والناتج سيكون تنفيذ الصفحة! (بالطبع فقط أكواد وكتابة لا يوجد هناك عرض ملون أو أي شيء من هذا القبيل).</p></div>
</div>
</div>
<h1>ملاحظات</h1>
<ul>
<li>توجد طريقة جاهزة في Ubuntu لعمل معظم هذه الخطوات<span style="text-decoration: line-through;"> لكنها غير آمنة! وتسببت بحذف النظام عندي.</span> تستطيع أن تجربها بنفسك من خلال Synaptic Package Manager ثم Edit ثم Mark packages by task... ثم ضع علامة صح على LAMPP Server، وأضغط OK وركب الحزم ليكون لديك LAMPP متكون من mysql-5.0و php5 وبعض الحزم الأخرى وأنبه أن هذا لا ينزل أي شيء آخر مثل phpmyadmin, ftpserver, sqlite والكثير من الأمور الأخرى التي سيتوجب عليك أن تنزلها بيدك!</li>
<li><strong>متقدم:</strong> إستخدام gksudo أو "Alt+F2" هو إستخدام الحل الأسهل والأجمل ^^. ربما يعترض بعض الإخوة لأن هذه الطريقة تمنع المستخدم من التعرف على Trminal. فأقول له لا مشكلة. فمصادر الأنترنت موجودة. :). ويستطيع التعلم عليه إن أراد!.</li>
</ul>
</div>
<div style="text-align: right;">
<div style="text-align: center;">
<h2>عن المستند</h2>
<div style="text-align: right;"><span style="font-size: medium;">الكاتب:</span> عمر الدليمي, <a id="u7ye" title="http://www.omardo.com" href="../../">http://www.omardo.com</a><br />
<span style="font-size: medium;">للإتصال</span>: أرحب بكافة الملاحظات والنصائح حول ما أكتب:  <strong><a id="l4y1" title="إتصل بي" href="../contact-me">إتصل بي</a></strong><br />
<span style="font-size: small;">الترخيص:</span> <strong><a id="f2d-" title="Creative Commons 3.0 - by-sa" href="http://creativecommons.org/licenses/by-sa/3.0/">Creative Commons 3.0 - by-sa</a></strong></p>
<div style="text-align: right;"><span style="font-size: small;"><strong style="color: #666666;"><br />
المصادر الخارجية</strong></span><br />
<span style="font-size: small;"> <strong>1</strong></span>) بعض الملاحظات عن طريقة التركيب</p>
<div style="text-align: center;"><strong>www.Abuh.net</strong>, <a id="lh9f" title="http://www.abduh.net/?p=252" href="http://www.abduh.net/?p=252">http://www.abduh.net/?p=252</a></div>
<p>للأمانة: النقل تم بدون إستشارته! اتمنى أن لا يمانع.</p>
<p><strong><span style="font-size: small;">2</span></strong>) المقدمة (نصاً)</p>
<div style="text-align: center;"><strong>Br4v3-H34r7</strong>, <a id="mcg." title="http://br4v3-h34r7.com/2008/03/10/xampp-localhost" href="http://br4v3-h34r7.com/2008/03/10/xampp-localhost">http://br4v3-h34r7.com/2008/03/10/xampp-localhost</a></div>
<p><strong><span style="font-size: small;">2</span></strong>) ملحوظات صغيرة</p>
<div style="text-align: center;"><strong>مجتمع لينوكس العربي</strong>, <a id="mcg." title="http://br4v3-h34r7.com/2008/03/10/xampp-localhost" href="http://www.linuxac.org/">http://www.linuxac.org</a></div>
</div>
</div>
</div>
</div>
</div>
