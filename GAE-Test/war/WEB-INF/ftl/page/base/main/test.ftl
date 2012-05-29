<#assign spring=JspTaglibs["http://www.springframework.org/tags"] />
<span>Test OK</span>
<img alt="test" src="/r/img/folderIcon.gif" />
<table>
    <thead>
        <tr>
            <th>name</th><th>createDt</th>
        </tr>
    </thead>
    <tbody>
<#if members?has_content>
<#list members as member>
    <tr>
        <td>${member.properties.name}</td>
        <td><#if member.properties.createDt?has_content>${member.properties.createDt?datetime}</#if></td>
    </tr>
</#list>
</#if>
    </tbody>
</table>
