<#assign tiles=JspTaglibs["http://tiles.apache.org/tags-tiles"] />
<#assign spring=JspTaglibs["http://www.springframework.org/tags"] />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><@tiles.getAsString name="title" /></title>
<#--
<@tiles.insertAttribute name="script" />
-->
<@tiles.insertAttribute name="header" />
<!-- content // begin -->
    <div id="conts-w">
<@tiles.insertAttribute name="conts" />
    </div>
<!-- content // end -->
<@tiles.insertAttribute name="footer" />
</div>
</body>
</html>