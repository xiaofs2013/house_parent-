<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0044)http://localhost:8080/HouseRent/page/add.jsp -->
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>青鸟租房 -发布房屋信息</TITLE>
    <META content="text/html; charset=utf-8" http-equiv=Content-Type>
    <LINK
            rel=stylesheet type=text/css href="../css/style.css">
    <META name=GENERATOR content="MSHTML 8.00.7601.17514">
    <script language="JavaScript" type="text/javascript" src="../admin/js/jquery-1.8.3.js"></script>
</HEAD>
<BODY>
<DIV id=header class=wrap>
    <DIV id=logo><IMG src="../images/logo.gif"></DIV>
</DIV>
<DIV id=regLogin class=wrap>
    <DIV class=dialog>
        <DL class=clearfix>
            <DT>房屋信息修改</DT>
            <DD class=past>修改房屋信息</DD>
        </DL>
        <DIV class=box>
            <FORM id=add_action method=post enctype="multipart/form-data"
                  action=updateHouse>

                <INPUT id=d class=text value="${requestScope.HouseOne.id}" type=hidden name=id>
                <%--修改哪能没个ID呢--%>

                <%--添加文件必须使用post的方式提交 并且需要添加   enctype="multipart/form-data"  属性 --%>

                <DIV class=infos>
                    <TABLE class=field>
                        <TBODY>
                        <TR>
                            <TD class=field>标　　题：</TD>
                            <TD><INPUT id=add_action_title class=text type=text name=title
                                       value="${requestScope.HouseOne.title}"></TD>
                        </TR>
                        <TR>
                            <TD class=field>户　　型：</TD>
                            <TD><SELECT class=text name=typeId id="type_id">
                            </SELECT></TD>
                        </TR>
                        <TR>
                            <TD class=field>面　　积：</TD>
                            <TD><INPUT id=add_action_floorage class=text type=text
                                       name=floorage value="${requestScope.HouseOne.floorage}"></TD>
                        </TR>
                        <TR>
                            <TD class=field>价　　格：</TD>
                            <TD><INPUT id=add_action_price class=text type=text name=price
                                       value="${requestScope.HouseOne.price}"></TD>
                        </TR>
                        <TR>
                            <TD class=field>房产证日期：</TD>
                            <TD><INPUT class=text type=date name=pubdate
                                       value="<fmt:formatDate value="${requestScope.HouseOne.pubdate}" pattern="yyyy-MM-dd"/>">
                            </TD>

                        </TR>
                        <TR>
                            <TD class=field>位　　置：</TD>
                            <TD>区：<SELECT class=text name=district_id id="district_id">

                            </SELECT>
                                街：<SELECT class=text name=streetId id="street_id">

                                </SELECT></TD>
                        </TR><!--
						<tr>
							<td class="field">坐  标：</td>
							<td><input type="text" class="text" name="point" />
							</td>
						</tr>
						--><!--  <tr>
							<td class="field">Y 坐  标：</td>
							<td><input type="text" class="text" name="point.y" /></td>
						</tr>-->
                        <TR>
                            <TD class=field>联系方式：</TD>
                            <TD><INPUT id=add_action_contact class=text type=text name=contact
                                       value="${requestScope.HouseOne.contact}"></TD>
                        </TR>
                        <TR>
                            <TD class=field>详细信息：</TD>
                            <TD><TEXTAREA name=description>${requestScope.HouseOne.description}</TEXTAREA></TD>
                        </TR>

                        <img src="http://localhost:81/${requestScope.HouseOne.path}" height="50" width="40"/>
                        <TR>
                            <TD class=field>图片上传：</TD>
                            <TD><input type="file" class="text" name="pfile" id="pic"
                                       value="${requestScope.HouseOne.path}"></TD>
                            <INPUT class=text type=hidden name=delimage value="${requestScope.HouseOne.path}">
                            <%--定义一个隐藏的表单  里面放着图片的回显参数 拿到控制层进行删除工作--%>
                        </TR>
                        </TBODY>
                    </TABLE>
                    <DIV class=buttons><INPUT value=立即发布 type=submit>
                    </DIV>
                </DIV>
            </FORM>
        </DIV>
    </DIV>
</DIV>
<DIV id=footer class=wrap>
    <DL>
        <DT>青鸟租房 © 2018 北大青鸟 京ICP证1000001号</DT>
        <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD>
    </DL>
</DIV>
</BODY>

<script language="JavaScript">

    $(function () {  //加载事件
        //1.发送异步请求获取类型，进行显示
        $.post("GetTypeAll", null, function (data) {
            for (var i = 0; i < data.length; i++) {
                //创建节点
                var node = $("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                //追加节点
                $("#type_id").append(node);
                $("#type_id").val(${requestScope.HouseOne.typeId});
            }
        }, "json");


        //1.发送异步请求获取区域，进行显示
        $.post("getAllDistrict", null, function (data) {
            for (var i = 0; i < data.length; i++) {
                //创建节点
                var node = $("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                //追加节点
                $("#district_id").append(node);


                $("#district_id").val(${requestScope.HouseOne.did});


                $("#type_id").val(${requestScope.HouseOne.typeId});
            }
            loadStreet();  //加载街道
        }, "json");

        //给区域添加改变事件
        $("#district_id").change(loadStreet);

        //加载街道   代码复用
        function loadStreet() {
            //获取区域编号
            var did = $("#district_id").val();
            //发送异步请求加载街道数据
            //清空原有数据项
            $("#street_id>option").remove();
            $.post("getStreetByDid", {"did": did}, function (data) {
                //这个地方did参数一定要注意 这里写了是did 那么控制器里面的方法参数全部都要写did 不能写id  不然他识别不到

                for (var i = 0; i < data.length; i++) {
                    //创建节点
                    var node = $("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
                    //追加节点
                    $("#street_id").append(node);

                    //设置街道的选中项
                    $("#street_id").val(${requestScope.HouseOne.streetId});

                }
            }, "json");


        }

    });


</script>

</HTML>
