<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<head>
    <title>
        Question search
    </title>
    <link type="text/css" rel="stylesheet" href="css/bootstrap.css"/>
    <link type="text/css" rel="stylesheet" href="css/search.css"/>
</head>

<form action="/search" method="get" class="form">
    <div class="center-block">
        <input type="text" name="query" placeholder="Type your question" class="input-search">
        <input type="submit" value="Search" class="btn">
    </div>
</form>

<#if questions??>
    <#list questions as q>
        <div class="space-between-box">
            <span class="elem">${q.creationDate}</span>
            <span class="elem"><a href="${q.link}">${q.title}</a></span>
            <#if q.owner.profile_image??>
                <span class="elem-small">
                    <a href="${q.owner.link?if_exists}">${q.owner.display_name}</a>
                </span>
                <span class="elem-small">
                    <img src="${q.owner.profile_image}" class="avatar">
                </span>
            <#else>
                <span class="elem-small">
                    <a href="${q.owner.link?if_exists}">${q.owner.display_name}</a>
                </span>
                <span class="elem-small">
                    <img src="img/empty.jpg" class="avatar">
                </span>
            </#if>
            <#if q.answered>
                <span class="elem-small">
                    <img src="img/tick.jpg"
                         class="avatar">
                </span>
            <#else>
                <span class="elem-small">
                    <img src="img/cross.jpg"
                         class="avatar">
                </span>
            </#if>
        </div>
    </#list>
</#if>