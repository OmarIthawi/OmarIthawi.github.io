---
layout: post
status: publish
published: true
title: "طريقة منع التدوينات من الظهور على الصفحة الرئيسية بالمدونة"
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 75
wordpress_url: http://www.omardo.com/blog/?p=75
date: '2008-05-17 20:05:41 +0000'
date_gmt: '2008-05-17 18:05:41 +0000'
---
<p><a href="http://www.omardo.com/blog/archives/75"><img class="alignright size-full wp-image-79" style="float: right; margin: 4px;" title="إخفاء التدوينة بلا مسح" src="http://www.omardo.com/blog/wp-content/uploads/hide-no-delete.png" alt="إخفاء التدوينة بلا مسح" width="114" height="114" /></a>هذا الموضوع يبين كيفية إلغاء بعض التدوينات من الظهور على الرئيسية. مع الإحتفاظ بها في الأقسام .. وعدم مسحها أصلاً.</p>
<p><strong>س:</strong> لماذا قد أقوم بهذا؟<br />
<strong>ج:</strong> بعض التدوينات لا تستحق أن يضيع الزائر لأول مرة وقته على قراءتها! أو إنها تكون قد إستهلكت - تخص حدثاً عابراً - .</p>
<p><strong>ملاحظة:</strong> <span style="color: #999999;">هذا الدرس يتحدث عن برنامج <span style="text-decoration: underline;">Wordpress</span> للنشر الإلكتروني. والذي أستخدمه في موقعي. لذا لا تتوقع أن يعمل على أي برنامج آخر!</span></p>
<p><span style="color: #ff0000;"><strong>الطريقة هي:</strong></span><!--more--></p>
<p><span style="color: #ff0000;"><strong>أولاً</strong></span></p>
<ol>
<li>أنشي تصنيفاً وسمه ما شئت. أنا أسميته "غير مهم".</li>
<li>وإعرف رقمه (id) وتستطيع ذلك من الرابط بالضغط عليه لتعديله.</li>
<li>لا تفعل شيئاً فقط أنظر إلى الرابط ستجد رقما بعد الكلمة cat_ID هذا الرقم ستحتاجه لاحقاً .. إكتبه في مكان ما. توضيح خذ الجزء كما هو موضح.</li>
</ol>
<p style="text-align: center;"><a href="http://www.omardo.com/blog/wp-content/uploads/cat-id-wp.png"><img class="size-thumbnail wp-image-76" style="border: 2px solid black; margin: 2px;" title="توضيح مكان الرقم" src="http://www.omardo.com/blog/wp-content/uploads/cat-id-wp-150x102.png" alt="توضيح مكان الرقم" width="150" height="102" /></a></p>
<p><span style="color: #ff0000;"><strong>ثانياً</strong></span></p>
<ol>
<li>من لوحة التحكم إذهب إلى تحرير القوالب.</li>
<li>إختر من القائمة الملف المسمى بالـ الصفحة الرئيسية index.php .</li>
<li>إنسخ محتويات الملف إلى أي محرر نصي أفضل [تستطيع التعديل عليه من الموقع].</li>
<li>إذهب إلى السطر المحتوي على هذا النص:
<p class="MsoNormal" style="text-align: left; direction: ltr; unicode-bidi: embed;"><span style="font-size: 10pt; font-family: Tahoma; color: red;">&lt;?php</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><strong><span style="font-size: 10pt; font-family: Tahoma; color: blue;">while</span></strong><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">(</span><span style="font-size: 10pt; font-family: Tahoma; color: black;">have_posts</span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">())</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">:</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> the_post</span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">();</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: red;">?&gt;</span></p>
<p><span dir="ltr"> </span></li>
<li> أضف تحته مباشرةً هذا السطر:
<p class="MsoNormal" dir="ltr"><span style="font-size: 10pt; font-family: Tahoma; color: red;">&lt;?</span><span style="font-size: 10pt; font-family: Tahoma; color: red;">php</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><strong><span style="font-size: 10pt; font-family: Tahoma; color: blue;">if</span></strong><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">(</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> in_category</span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">(</span><span style="font-size: 10pt; font-family: Tahoma; color: gray;">'xxx'</span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">)</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">&amp;&amp;</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> is_home</span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">()</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">)</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><strong><span style="font-size: 10pt; font-family: Tahoma; color: blue;">continue</span></strong><span style="font-size: 10pt; font-family: Tahoma; color: #8000ff;">;</span><span style="font-size: 10pt; font-family: Tahoma; color: black;"> </span><span style="font-size: 10pt; font-family: Tahoma; color: red;">?&gt;</span></p>
<p>مستبدلاً (xxx) بالرقم الذي أخذته من الرابط.</p>
<p style="text-align: center;"><a href="http://www.omardo.com/blog/wp-content/uploads/code-php-arwp.png"><img class="size-thumbnail wp-image-77" style="border: 2px solid black; margin: 2px;" title="مكان السطر البرمجي" src="http://www.omardo.com/blog/wp-content/uploads/code-php-arwp-150x150.png" alt="مكان السطر البرمجي" width="150" height="150" /></a></p>
</li>
<li> إنسخ الكود إلى موقعك وأحفظ التغييرات. وإن شاء الله كل شيء يسري بخير  ..أخيراً: ضع التدوينات المطلوبة في هذا التصنيف "<span style="color: #0000ff;">غير مهم</span>" .. لتجدها قد إختفت و<span style="color: #808080;">بتأثير سحري</span> من الصفحة الرئيسية!.</li>
</ol>
<p><strong><span style="text-decoration: underline;">ملاحظات:</span></strong> يفضل أن لا تعدل على الكود أكثر من ذلك إن كنت لا تعرف شيئاً إلا في حالة أخذ نسخة إحتياطية.. كيف؟ إبحث!<br />
هذه التجربة صارت بنجاح على مدونتي بالنسخة 2.5 .. لا تلوموني بالنسبة للنسخ الأخرى ..</p>
<p style="text-align:center"><span style="color: #0000ff;"><strong>شكراً لكم</strong></span></p>
