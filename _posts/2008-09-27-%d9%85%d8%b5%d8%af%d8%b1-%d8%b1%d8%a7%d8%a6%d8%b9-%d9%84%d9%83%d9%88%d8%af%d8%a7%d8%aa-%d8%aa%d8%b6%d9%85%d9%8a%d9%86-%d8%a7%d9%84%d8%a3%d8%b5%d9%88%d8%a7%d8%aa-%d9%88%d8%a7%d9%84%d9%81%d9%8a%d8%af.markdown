---
layout: post
status: publish
published: true
title: "مصدر رائع لكودات تضمين الأصوات والفيديو في XHTML"
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 293
wordpress_url: http://www.omardo.com/blog/?p=293
date: '2008-09-27 09:00:32 +0000'
date_gmt: '2008-09-27 07:00:32 +0000'
---
<p><span style="color: #ff0000;"><strong>ملاحظة:</strong></span> ه<span style="color: #808080;">ذا يخص مطوري المواقع لذلك قد لا تفهمه :). فلا تبتأس فالمدونة تحوي أشياء أخرى. قلب صفحاتها ;).</span></p>
<p>خرجت لنا منظمة W3C بقواعد لمستندات XHTML. قابلها الكثيرون بالرفض وأخص منهم المصممين العرب. لأن أغلبهم تعود على إستخدام FrontPage المشؤوم في تصميم صفحاته. وخيرهم كان يعمل على Dreamweaver. أكثر هذه المشاكل هي بسبب الجهل أو بتعبير أصح قلة المعرفة والخوف منها!.</p>
<p>من أبرز المشاكل التي يشتكون منها هي مسألة تضمين (Embed) الوسائط المتعددة داخل صفحات الأنترنت، أمثال الصيغ (flv, mp3, rm, wav, wmv, avi) وأكثر ما أشتهر بهذه المشكلة الصيغة SWF فكلنا يعرف كثرة إستخدمها في هذه الفترة!.</p>
<p>في الحقيقة لم تكن W3C مخطئة عندما خرجت لنا بهذه المعايير الصعبة أو بتعبير أصح الموحدة. فقد كانت المعايير رائعة ووحدت الكثير من المسائل وقللت العبئ على مصممي المواقع ومنتجي المتصفحات على حد سواء.</p>
<p>والحل:<!--more-->أنظر أسفل الصفحة</p>
<p>ولم تغفل عن نقطة مهمة مثل هذه <span style="color: #999999;"><strong>- تضمين (Embed) الوسائط المتعددة داخل صفحات الأنترنت، -</strong></span> فقد قدمت حلاً موحداً وهو إستخدام الوسم Object.</p>
<p>حسناً ولكن هذا الأمر لايزال مجهولاً لكثير من المطورين، بسبب عدم دعم البرامج له مثل Dreamweaver أو غيره.</p>
<h2 style="text-align: center;"><span style="color: #333333;">الحل الرائع للمشكلة</span></h2>
<p style="text-align: right;">وجدت هذا الموقع الذي يقدم لك أكواد لتشغيل جميع الصيغ وتحت كل كود يوجد مثال وجدول يوضح المتصفحات التي تدعم هذا الكود.</p>
<p style="text-align: center;">الموقع: <a href="http://joliclic.free.fr/html/object-tag/en/object-xhtml-test-suite.php">http://joliclic.free.fr/html/object-tag/en/object-xhtml-test-suite.php</a></p>
<p style="text-align: center;">وهو يحوي كودات XHTML، صالحة للعمل بحسب معايير W3C. لكل الإمتدادات التالية وغيرها:</p>
<p style="text-align: center;">pdf, mpg, avi, wmv, mov, wav, mp3, ogg, mid, svg, swf, rm, 'java applet'</p>
<p style="text-align: center;">بعد فتح الصفحة إختر الصيغة المطلوبة وسيظهر لك الكود المعني بها وتصرف به إنت :).</p>
<p style="text-align: center;">أنت كمطور ويب يفترض بك معرفة كيفية تعديل الكود ووضع رابط الملف داخله :). فهو مقروء وسهل، وكتلميح. ستجد كود يتكون من 5 أسطر أو ما شابه. تمعن به وستجده يحوي على ثلاثة روابط الأول تسبقه كلمة <strong>data</strong> والثاني تسبقه كلمة <strong>src</strong> هذا هما المهمان إستبدلهما بنفس رابط الملف المطلوب. والثالث تسبقه كلمة <strong>alt</strong> هذا مهم ويفيد في حالة عدم دعم المتصفح لهذا النوع من الملفات، كأن يكون متصفح قديم أو جهاز جوال وما إلى ذلك :).</p>
<p style="text-align: center;"><span style="color: #ff9900;">أرجوا نشر هذه المعلومة :). <strong>والإشارة للمصدر كرم منك :).</strong></span></p>
