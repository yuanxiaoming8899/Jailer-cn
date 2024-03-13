<div class="Box-sc-g0xbh4-0 bJMeLZ js-snippet-clipboard-copy-unpositioned" data-hpc="true"><article class="markdown-body entry-content container-lg" itemprop="text"><div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Jailer 数据库工具</font></font></h1><a id="user-content-jailer-database-tool" class="anchor" aria-label="永久链接：Jailer 数据库工具" href="#jailer-database-tool"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Jailer 是一个用于数据库子集化和关系数据浏览的工具。</font></font></p>
<ul dir="auto">
<li>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Subsetter 从数据库中创建小片段（一致且引用完整）作为 SQL（拓扑排序）、DbUnit 记录或 XML。</font></font></p>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">非常适合创建小测试数据样本或使用相关生产数据进行本地问题分析。</font></font></p>
</li>
<li>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">数据浏览器允许您按照表之间的关系（基于外键或用户定义的关系）浏览数据库。</font></font></p>
</li>
</ul>
<p dir="auto"><a target="_blank" rel="noopener noreferrer" href="/Wisser/Jailer/blob/master/docs/screenshot.png"><img src="/Wisser/Jailer/raw/master/docs/screenshot.png" width="500" style="max-width: 100%;"></a></p>
<details open="" class="details-reset border rounded-2">
  <summary class="px-3 py-2">
    <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-device-camera-video">
    <path d="M16 3.75v8.5a.75.75 0 0 1-1.136.643L11 10.575v.675A1.75 1.75 0 0 1 9.25 13h-7.5A1.75 1.75 0 0 1 0 11.25v-6.5C0 3.784.784 3 1.75 3h7.5c.966 0 1.75.784 1.75 1.75v.675l3.864-2.318A.75.75 0 0 1 16 3.75Zm-6.5 1a.25.25 0 0 0-.25-.25h-7.5a.25.25 0 0 0-.25.25v6.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-6.5ZM11 8.825l3.5 2.1v-5.85l-3.5 2.1Z"></path>
</svg>
    <span aria-label="视频描述 DataBrowser.mp4" class="m-1"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">数据浏览器.mp4</font></font></span>
    <span class="dropdown-caret"></span>
  </summary>

  <video src="https://private-user-images.githubusercontent.com/861721/142761281-299bddc4-eea7-4f26-8c24-54fccb31b152.mp4?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTAzMTMwNDcsIm5iZiI6MTcxMDMxMjc0NywicGF0aCI6Ii84NjE3MjEvMTQyNzYxMjgxLTI5OWJkZGM0LWVlYTctNGYyNi04YzI0LTU0ZmNjYjMxYjE1Mi5tcDQ_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzEzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMxM1QwNjUyMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02MzU1NjNmYmI4ODY5Y2JhYmZjMzBkYmQ0Y2MwZThlMmRjOWE5YzVhYWYwYTFmYjBmNjRhYjNjMDgzMjNmM2FkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.WdrnNzbPge4ftWQbgO40MoLPNX3egyCeHe2vDuZSVIs" data-canonical-src="https://private-user-images.githubusercontent.com/861721/142761281-299bddc4-eea7-4f26-8c24-54fccb31b152.mp4?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTAzMTMwNDcsIm5iZiI6MTcxMDMxMjc0NywicGF0aCI6Ii84NjE3MjEvMTQyNzYxMjgxLTI5OWJkZGM0LWVlYTctNGYyNi04YzI0LTU0ZmNjYjMxYjE1Mi5tcDQ_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzEzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMxM1QwNjUyMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02MzU1NjNmYmI4ODY5Y2JhYmZjMzBkYmQ0Y2MwZThlMmRjOWE5YzVhYWYwYTFmYjBmNjRhYjNjMDgzMjNmM2FkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.WdrnNzbPge4ftWQbgO40MoLPNX3egyCeHe2vDuZSVIs" controls="controls" muted="muted" class="d-block rounded-bottom-2 border-top width-fit" style="max-height:640px; min-height: 200px">

  </video>
</details>

<p dir="auto"><a href="https://wisser.github.io/Jailer/videos.html" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">更多视频</font></font></a></p>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">特征</font></font></h2><a id="user-content-features" class="anchor" aria-label="永久链接：特点" href="#features"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<ul dir="auto">
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">从生产数据库中导出一致且引用完整的行集，并将数据导入到您的开发和测试环境中。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">通过删除和归档过时的数据而不破坏完整性来提高数据库性能。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">生成拓扑排序的 SQL-DML、分层结构的 XML 和 DbUnit 数据集。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">数据浏览。</font><font style="vertical-align: inherit;">通过遵循基于外键或用户定义的关系，在数据库中进行双向导航。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">SQL 控制台具有代码完成、语法突出显示和数据库元数据可视化功能。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">包含一个演示数据库，您无需任何配置即可获得第一印象。</font></font></li>
</ul>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">支持的数据库</font></font></h2><a id="user-content-supported-databases" class="anchor" aria-label="永久链接：支持的数据库" href="#supported-databases"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">由于使用了 JDBC 技术，原则上支持任何 DMBS。</font><font style="vertical-align: inherit;">然而，为了获得最佳结果，特定的附加支持功能很有用。</font><font style="vertical-align: inherit;">这些可用于：</font></font></p>
<ul dir="auto">
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">PostgreSQL</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">甲骨文</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">MySQL</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">玛丽亚数据库</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">微软SQL服务器</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">IBM DB2</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">SQLite</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">赛贝斯</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">亚马逊红移</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">火鸟</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Informix 动态服务器</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">氢2</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">埃克萨索尔</font></font></li>
</ul>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">消息</font></font></h2><a id="user-content-news" class="anchor" aria-label="永久链接：新闻" href="#news"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<ul dir="auto">
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2023-02-03 通过对语句的深入分析，SQL 控制台现在可以将查询结果与源表相关联并相应地显示它们。</font><font style="vertical-align: inherit;">此外，该技术还允许将过滤条件动态添加到任意 SQL 查询中。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2022-01-01 整个用户界面全面重新设计和现代化。</font><font style="vertical-align: inherit;">新外观和感觉</font></font><a href="https://github.com/JFormDesigner/FlatLaf"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">FlatLaf</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2021-02-04 亲子关系中的循环将被检测并打破。</font><font style="vertical-align: inherit;">因此，可以通过推迟插入可为空的外键来导出此类数据。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2020-02-04 Jailer引擎发布在Maven存储库中。</font></font><a href="https://mvnrepository.com/artifact/io.github.wisser/jailer-engine" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">https://mvnrepository.com/artifact/io.github.wisser/jailer-engine</font></font></a></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2019-02-01 如果数据模型在上次更改此提取模型后已扩展，则新的“模型迁移工具”允许您轻松查找和编辑新添加的关联。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2018-04-26 新功能“Analyze SQL”分析SQL语句并提出关联定义。</font><font style="vertical-align: inherit;">这允许基于现有 SQL 查询对数据模型进行逆向工程。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2018-03-06 SQL 控制台，具有代码完成、语法突出显示和数据库元数据可视化功能。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2017-05-10 新的 API 提供对数据导出和导入功能的编程访问。</font></font><a href="https://wisser.github.io/Jailer/api.html" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">https://wisser.github.io/Jailer/api.html</font></font></a></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2017-03-30 改进过滤器管理。</font><font style="vertical-align: inherit;">模板允许您定义将过滤器分配给列的规则。</font><font style="vertical-align: inherit;">主键列上的过滤器将自动传播到相应的外键列。</font></font><a href="https://wisser.github.io/Jailer/filters.html" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">https://wisser.github.io/Jailer/filters.html</font></font></a></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2015-12-04 现在还可以将数据直接导出到同一数据库的模式。</font><font style="vertical-align: inherit;">这可确保最佳性能。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2015-10-23 行也可以收集在单独的嵌入式数据库中。</font><font style="vertical-align: inherit;">这允许从只读数据库导出数据。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2014-07-20 实现了“按示例子集”功能：使用数据浏览器收集所有要提取的行，并让 Jailer 为该子集创建模型。</font></font><a href="https://wisser.github.io/Jailer/subset-by-example.html" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">https://wisser.github.io/Jailer/subset-by-example.html</font></font></a></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2014-04-15 引入了数据浏览器。</font><font style="vertical-align: inherit;">通过遵循基于外键或用户定义的关系，在数据库中进行双向导航。</font></font></li>
</ul>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">安装</font></font></h2><a id="user-content-installation" class="anchor" aria-label="永久链接：安装" href="#installation"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">使用安装文件“Jailer-database-tools-nnnmsi”（适用于 Windows）或“jailer-database-tools_n.nn-x64.deb”（适用于 Linux）。</font></font></p>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">除非你想使用自己安装的Java。</font><font style="vertical-align: inherit;">然后解压缩文件“jailer_n.nnzip”。</font><font style="vertical-align: inherit;">也可以看看</font></font><a href="https://wisser.github.io/Jailer/faq.html#multiuser" rel="nofollow"></a><a href="https://wisser.github.io/Jailer/faq.html#multiuser" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">https://wisser.github.io/Jailer/faq.html#multiuser</font></font></a></p>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">要从解压的 zip 中启动该工具：</font></font></p>
<ul dir="auto">
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">在Windows平台上执行“Jailer.exe”。</font><font style="vertical-align: inherit;">您还可以启动“jailerGUI.bat”。</font></font></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">在 Unix/Linux 平台上执行脚本“jailerGUI.sh”或使用“java -jar jamer.jar”</font></font></li>
</ul>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">建筑</font></font></h2><a id="user-content-building" class="anchor" aria-label="永久链接： 建筑" href="#building"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">克隆 git 存储库：</font></font></p>
<ul dir="auto">
<li><code>git clone https://github.com/Wisser/Jailer.git</code></li>
</ul>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">要构建该工具，您只需使用 ant：( </font></font><a href="https://ant.apache.org" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">https://ant.apache.org</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> )</font></font></p>
<ul dir="auto">
<li><code>cd Jailer</code></li>
<li><code>ant</code></li>
</ul>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">接触</font></font></h2><a id="user-content-contact" class="anchor" aria-label="永久链接：联系方式" href="#contact"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<ul dir="auto">
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">主页：https:     </font></font><a href="https://github.com/Wisser/Jailer"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">//github.com/Wisser/Jailer</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">或</font></font><a href="http://jailer.sourceforge.net/" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">http://jailer.sourceforge.net/</font></font></a></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">论坛：    https: </font></font><a href="https://sourceforge.net/p/jailer/discussion/" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">//sourceforge.net/p/jailer/discussion/</font></font></a></li>
<li><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">支持：</font></font><a href="mailto:rwisser@users.sourceforge.net"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">rwisser@users.sourceforge.net</font></font></a></li>
</ul>
<div class="markdown-heading" dir="auto"><h2 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">贡献者</font></font></h2><a id="user-content-contributors" class="anchor" aria-label="永久链接：贡献者" href="#contributors"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<div class="markdown-heading" dir="auto"><h3 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">代码贡献者</font></font></h3><a id="user-content-code-contributors" class="anchor" aria-label="永久链接：代码贡献者" href="#code-contributors"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">这个项目的存在要感谢所有做出贡献的人。
</font></font><a href="https://github.com/Wisser/Jailer/graphs/contributors"><img src="https://camo.githubusercontent.com/1c1313dd278bc3ad8143a028f9777be11aee1bb1ca07f9f658710b8647cfd6d7/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f636f6e7472696275746f72732e7376673f77696474683d38393026627574746f6e3d66616c7365" data-canonical-src="https://opencollective.com/Jailer/contributors.svg?width=890&amp;button=false" style="max-width: 100%;"></a></p>
<div class="markdown-heading" dir="auto"><h3 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">财务贡献者</font></font></h3><a id="user-content-financial-contributors" class="anchor" aria-label="永久链接：财务贡献者" href="#financial-contributors"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">成为财务贡献者并帮助我们维持我们的社区。</font><font style="vertical-align: inherit;">[</font></font><a href="https://opencollective.com/Jailer/contribute" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">贡献</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">]</font></font></p>
<div class="markdown-heading" dir="auto"><h4 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">个人</font></font></h4><a id="user-content-individuals" class="anchor" aria-label="永久链接：个人" href="#individuals"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><a href="https://opencollective.com/Jailer" rel="nofollow"><img src="https://camo.githubusercontent.com/252834074ac73dd89dc868f241200a32663e4527b742ac51cd922cb8ca2a368b/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f696e646976696475616c732e7376673f77696474683d383930" data-canonical-src="https://opencollective.com/Jailer/individuals.svg?width=890" style="max-width: 100%;"></a></p>
<div class="markdown-heading" dir="auto"><h4 tabindex="-1" class="heading-element" dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">组织机构</font></font></h4><a id="user-content-organizations" class="anchor" aria-label="永久链接：组织" href="#organizations"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">与您的组织一起支持该项目。</font><font style="vertical-align: inherit;">您的徽标将显示在此处，并带有指向您网站的链接。</font><font style="vertical-align: inherit;">[</font></font><a href="https://opencollective.com/Jailer/contribute" rel="nofollow"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">贡献</font></font></a><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">]</font></font></p>
<p dir="auto"><a href="https://opencollective.com/Jailer/organization/0/website" rel="nofollow"><img src="https://camo.githubusercontent.com/de20879cc0e5830eb5f85f107e1f781c98e6221cda3d5b8e14455ebca3d95934/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f302f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/0/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/1/website" rel="nofollow"><img src="https://camo.githubusercontent.com/207ef79cc24d11bfeed7239e8923204a24b9d619dbe1a6f6485c40e72fdd2145/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f312f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/1/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/2/website" rel="nofollow"><img src="https://camo.githubusercontent.com/44ee202a35d5ffd84748d66f8bc3380a97688838fc40c77d27cb158a693d356a/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f322f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/2/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/3/website" rel="nofollow"><img src="https://camo.githubusercontent.com/ef19017d8f7219a339012f2415f2d3430803a9a3f86fbc3eb5b92aa9dbe67586/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f332f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/3/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/4/website" rel="nofollow"><img src="https://camo.githubusercontent.com/48b2064b8f540866e89e553a45ae422d44464be87441f46d695d8dab3b7a6a10/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f342f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/4/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/5/website" rel="nofollow"><img src="https://camo.githubusercontent.com/ecf0b3e63d9311b88254a6d7f9498e2bee77a43aaa1edfee671f86652ffb818c/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f352f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/5/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/6/website" rel="nofollow"><img src="https://camo.githubusercontent.com/4b34335f853a0e2ca212f85fbed82068e5d763c23eb4d9be0fd714a81331cbf3/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f362f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/6/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/7/website" rel="nofollow"><img src="https://camo.githubusercontent.com/bf069e1986adf23285155fad90fa9d2d54c2a8f00cfd6828dc2ba024e28890c8/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f372f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/7/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/8/website" rel="nofollow"><img src="https://camo.githubusercontent.com/d4c7cc4f362b88ae5dc20f161f7b87d15d4da290fcc9b0b74467947ffbb0bd15/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f382f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/8/avatar.svg" style="max-width: 100%;"></a>
<a href="https://opencollective.com/Jailer/organization/9/website" rel="nofollow"><img src="https://camo.githubusercontent.com/010f71351c8013f3a3695bfde2cf63735d9f56579f6481e0b488b47a0f164a2f/68747470733a2f2f6f70656e636f6c6c6563746976652e636f6d2f4a61696c65722f6f7267616e697a6174696f6e2f392f6176617461722e737667" data-canonical-src="https://opencollective.com/Jailer/organization/9/avatar.svg" style="max-width: 100%;"></a></p>
</article></div>
