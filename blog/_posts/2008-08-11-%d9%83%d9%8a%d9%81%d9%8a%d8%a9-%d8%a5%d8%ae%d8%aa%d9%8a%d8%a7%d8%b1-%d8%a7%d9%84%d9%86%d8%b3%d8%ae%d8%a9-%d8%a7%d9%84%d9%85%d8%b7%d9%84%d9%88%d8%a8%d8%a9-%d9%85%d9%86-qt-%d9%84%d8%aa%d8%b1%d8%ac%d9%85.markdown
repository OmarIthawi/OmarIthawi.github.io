---
layout: post
status: publish
published: true
title: "كيفية إختيار النسخة المطلوبة من Qt لترجمة برامج ++C"
author:
  display_name: "عمر الدليمي"
  login: admin
  email: i@omardo.com
  url: http://www.omardo.com
author_login: admin
author_email: i@omardo.com
author_url: http://www.omardo.com
excerpt: "واجهت عدة مشاكل قبل أيام بترجمة (Compile) برنامج صغير عملته ليكون بـ Qt4
  لكن المترجم يترجمه على أنه Qt3 والأخطاء الظاهر لا تحصى"
wordpress_id: 154
wordpress_url: http://www.omardo.com/blog/?p=154
date: '2008-08-11 23:30:42 +0000'
date_gmt: '2008-08-11 21:30:42 +0000'
---
<p>[caption id="attachment_158" align="alignright" width="80" caption="Qt حزمة أدوات"]<a href="http://www.omardo.com/blog/wp-content/uploads/the-qt-v4.png"><img class="size-full wp-image-158" src="http://www.omardo.com/blog/wp-content/uploads/the-qt-v4.png" alt="Qt حزمة أدوات" width="80" height="80" /></a>[/caption]</p>
<p><strong><span style="color: #ff0000;">لمن هذا؟:</span> </strong><span style="color: #999999;">لمن يبرمج بلغة ++C، مستخدما حزمة أدوات Qt. :). لا حاجة لأن تفهم كل هذا. إن لم تعرف معناه .. تجاهل هذا الموضوع :).</span></p>
<p>واجهت عدة مشاكل قبل أيام بترجمة (Compile) برنامج صغير عملته ليكون بـ Qt4 لكن المترجم يترجمه على أنه Qt3 والأخطاء الظاهر لا تحصى &gt;.&lt; ..</p>
<p>بحثت عن الحل ووجدته -<span style="color: #999999;">بعد عناء</span>- في مكان غير ظاهر. فأحببت أن أشارككم به:</p>
<p><strong>أولا:</strong> عادة ما نستخدم لترجمة برنامج Qt الأوامر التالية من سطر الأوامر:<br />
<code>cd /source-code-directory<br />
qmake -project<br />
qmake<br />
make</code></p>
<p><!--more-->وبعضاً منا يستخدم (IDE<span style="color: #808080;">=بيئة تطوير متكاملة</span>) فلا يحتاج لسطر الأوامر مع أنه الطريقة الأفضل دائماً خصوصاً عند عدم إستخدام المحرر المرئي للواجهة للمبتدئين مثلي ومن لا زالو يتعلمون .. الـ IDE دائما تخذلنا بمشاكلها.<br />
الأمر السابق يترجم البرنامج بالنسخة الإفتراضية لQT.. يفترض أنها الأحدث دوما ولكنه يأخذ القديمة أحيانا لا أدري لم.</p>
<p>وبعد البحث تبين أن الأمر سهل وهو يجبر المترجم على إختيار النسخة المطلوبة دون غيرها، مثلا لــ Qt4 نستخدم:<br />
<code>cd /source-code-directory<br />
qmake-qt4 -project<br />
qmake-qt4<br />
make</code></p>
<p>مع أن هذا الأمر يعمل في سطر أوامر لينكس <span style="color: #808080;">(عندي)</span> لكنني متأكد أنه سيعمل في وندوز <span style="color: #808080;">(مجرب)</span> .. ولمن يسأل فالأمر <strong>cd</strong> للذهاب للمجلد المطلوب والأوامر البقية نفسها.</p>
<p>وبنفس الطريقة لإجباره بالترجمة على النسخة Qt3 <span style="color: #808080;">(غير مجرب ولكنني شبه متأكد)</span> . نستخدم:<br />
<code>cd /source-code-directory<br />
qmake-qt3 -project<br />
qmake-qt3<br />
make</code></p>
<p><span style="color: #0000ff;"><strong>تحديث:</strong></span> أنا أستخدم هذا الكود لأجل السرعة للنسخة Qt4 <span style="color: #808080;">(لينكس فقط)</span>:</p>
<p><code>cd "source-files-folder" &amp;&amp; qmake-qt4 -project &amp;&amp; qmake-qt4 &amp;&amp; make</code><br />
وللنسخة Qt3:</p>
<p><code>cd "source-files-folder" &amp;&amp; qmake-qt3 -project &amp;&amp; qmake-qt3 &amp;&amp; make</code></p>
<p>مع مرعاة إستبدال <strong>source-files-folder</strong> بالمسار الكامل لمكان وجود ملفات ++C. مع الإحتفاظ بعلامتي الإقتباس المزدوجة.</p>
<p><strong>ولا تنسى</strong> أن في هذه الحالة لا تستطيع وضع اكثر من (مشروع) واحد داخل كل مجلد وإلا سيحصل تضارب بين ملفات ++C.</p>
<p style="text-align: center;"><strong><span style="color: #0000ff;">تقبلوا تحيتي</span></strong></p>
