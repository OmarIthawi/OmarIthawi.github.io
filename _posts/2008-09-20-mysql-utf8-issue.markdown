---
layout: post
status: publish
published: true
title: "حل مشكلة الترميز UTF-8 واللغة العربية - قواعد بيانات MYSQL"
author:
  display_name: "عمر العيثاوي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
wordpress_id: 291
wordpress_url: http://www.omardo.com/blog/?p=291
date: '2008-09-20 15:07:52 +0000'
date_gmt: '2008-09-20 13:07:52 +0000'
---
<p>عندما تبرمج موقعاً بيدك كاملاً ستواجه مشاكل عدة، من هذه المشاكل: عند إختيارك الترميز UTF-8 لقواعد البيانات والعمل على اللغة العربية. يظهر المحتوى العربي في الموقع على شكل علامات إستفهام!</p>
<p>حسناً لا يأس مع الحياة :P. تستطيع حل المشكلة بإضافة إستعلام MYSQL هذا كي ينفذ مباشرة بعد الإتصال بقواعد البيانات:<!--more--><br />
<code>set character_set_server='utf8';<br />
set names 'utf8';</code></p>
<p>أو مثال على إستخدامها في لغة PHP (شكراً للأخ <a href="#comment-1149">أحمد</a> على التنبيه):</p>
<pre class="php"><span style="font-weight: bold; color: #000000;">&lt;?php</span>
    <a href="http://www.php.net/mysql_connect"><span style="color: #990000;">mysql_connect</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$db_hostname</span><span style="color: #339933;">,</span> <span style="color: #000033;">$db_username</span><span style="color: #339933;">,</span> <span style="color: #000033;">$db_password</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<a href="http://www.php.net/mysql_query"><span style="color: #990000;">mysql_query</span></a><span style="color: #009900;">(</span><span style="color: #0000ff;">"set character_set_server='utf8'"</span><span style="color: #009900;">)</span><span style="color: #339933;">;
</span><a href="http://www.php.net/mysql_query"><span style="color: #990000;">mysql_query</span></a><span style="color: #009900;">(</span><span style="color: #0000ff;">"set names 'utf8'"</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span><span style="color: #339933;"></span>
	<span style="font-style: italic; color: #666666;">// The rest of you php code!</span>
<span style="font-weight: bold; color: #000000;">?&gt;</span></pre>
<p>ويفضل إستخدامه مباشرة بعد الإتصال بقاعدة البيانات.<br />
<span style="color: #993300;"><strong>أحيانا</strong></span> هذا الكود لا يحل المشكلة فنجرب الكود التالي <strong>بدلاً منه</strong>:<br />
<code>set names 'utf8';</code><br />
أو بلغة php:</p>
<pre class="php"><span style="font-weight: bold; color: #000000;">&lt;?php</span>
    <a href="http://www.php.net/mysql_connect"><span style="color: #990000;">mysql_connect</span></a><span style="color: #009900;">(</span><span style="color: #000033;">$db_hostname</span><span style="color: #339933;">,</span> <span style="color: #000033;">$db_username</span><span style="color: #339933;">,</span> <span style="color: #000033;">$db_password</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<a href="http://www.php.net/mysql_query"><span style="color: #990000;">mysql_query</span></a><span style="color: #009900;">(</span><span style="color: #0000ff;">"set names 'utf8';"</span><span style="color: #009900;">)</span><span style="color: #339933;">;</span>
	<span style="font-style: italic; color: #666666;">// The rest of you php code!</span>
<span style="font-weight: bold; color: #000000;">?&gt;</span></pre>
<p>كما أن هناك بعض الخطوات التي يجب أن تتبعها قبل أن تعتمد هذا الحل وهن:</p>
<ol>
<li>جميع ملفاتك الخاصة بالموقع سواء كانت [[PHP]] أو [[HTML]] يجب أن تحمل الترميز UTF-8. ولا تنسى أيضاً كتابة نوع الترميز في ترويسة ملفات [[HTML]].</li>
<li>قاعدة البيانات يجب أن تكون بترميز UTF-8 ومن النوع <strong>utf8_unicode_ci</strong> ولا تجرب أن تختار غيره فالنتيجة غير مضمونة.</li>
</ol>
<p><span style="color: #000080;"> إذا لم تحل المشكلة إخبرني :)</span></p>
<p style="text-align: center;"><span style="color: #008000;">تقبلو تحيتي</span></p>
