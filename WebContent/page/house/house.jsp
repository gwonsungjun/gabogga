<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 헤더 -->

<!-- 여기서부터 우리가 꾸미기 -->
  <%@ include file="/page/template/header.jsp" %>
  <%@ include file="/page/house/reservationModal.jsp" %>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>
  <script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#Reservation").click(function(){
		$("#modalReservation").modal();
	})
});
</script>
	<!-- Blog Post Content Column -->
    <div class="col-sm-9">
       <!-- Blog Post -->
       		<!-- Title -->
       		<h1>This Guest House Title</h1>
        	<!-- Author -->
        	<p class="lead">by <a href="#">Start Bootstrap</a></p>
			<hr>
        <!-- Date/Time -->
        <p><span class="glyphicon glyphicon-time"></span>
        Posted on August 24, 2013 at 9:00 PM</p>
        <hr>
        <!-- Preview Image -->
        <img class="img-responsive" src="http://placehold.it/900x300" alt="">
        <hr>
        <!-- Post Content -->
        <p class="lead">Reservation Host Information</p>
        <hr>
        <div class="col-sm-4">
          <label>Guest House</label>
        </div>
        <div class="col-sm-4">
          <li>숙박 가능인원 : 4</li>
          <li>욕실 : 2.5</li>
        </div>
        <div class="col-sm-4">
          <li>체크인 : 14:00 ~ 02:00(다음날)</li>
          <li>체크아웃 : 12:00</li>
        </div>
        <div class="col-sm-4">
          <label>시설</label>
        </div>
        <hr>
        <div class="col-sm-4">
          <li>난방</li>
          <li>에어컨</li>
        </div>
        <div class="col-sm-4">
          <li>수영장</li>
          <li>옷걸이</li>
        </div>
        <p>예약을 다시한번 확인 해 주시기 바랍니다.</p>

        <hr>

        <!-- Blog Comments -->

        <!-- Comments Form -->
        <!-- <div class="well">
          <h4>Leave a Comment:</h4>
          <form role="form">
            <div class="form-group">
              <textarea class="form-control" rows="3"></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
          </form>
        </div> -->

		<!-- 라이브리 시티 설치 코드 -->
	    <div id="lv-container" data-id="city" data-uid="MTAyMC8yOTY4Ny82MjU1">
	    <script type="text/javascript">
	       (function(d, s) {
	           var j, e = d.getElementsByTagName(s)[0];
	
	           if (typeof LivereTower === 'function') { return; }
	
	           j = d.createElement(s);
	           j.src = 'https://cdn-city.livere.com/js/embed.dist.js';
	           j.async = true;
	
	           e.parentNode.insertBefore(j, e);
	       })(document, 'script');
	    </script>
	    <noscript>라이브리 댓글 작성을 위해 JavaScript를 활성화 해주세요</noscript>
	    </div>

        <hr>

        <!-- Posted Comments -->

        <!-- Comment -->
        <!-- <div class="media">
          <a class="pull-left" href="#">
             <img class="media-object" src="http://placehold.it/64x64" alt=""></a>
          <div class="media-body">
            <h4 class="media-heading">Start Bootstrap
               <small>August 25, 2014 at 9:30 PM</small>
                 </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo.
                 Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia conguefelis in faucibus.
          </div>
        </div> -->

        <!-- Comment -->
        <!-- <div class="media">
          <a class="pull-left" href="#">
            <img class="media-object" src="http://placehold.it/64x64" alt=""></a>
          <div class="media-body">
            <h4 class="media-heading">Start Bootstrap
               <small>August 25, 2014 at 9:30 PM</small>
                </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque
                ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue
            	felis in faucibus.
            Nested Comment
            <div class="media">
              <a class="pull-left" href="#">
 				<img class="media-object" src="http://placehold.it/64x64" alt=""></a>
              <div class="media-body">
                <h4 class="media-heading">Nested Start Bootstrap
                   <small>August 25, 2014 at 9:30 PM</small>
                     </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum
                     nunc ac nisi vulputate fringilla. Donec laciniacongue felis in faucibus.
              </div>
            </div>
            End Nested Comment
          </div>
        </div> -->

      </div>

      <!-- Blog Sidebar Widgets Column -->
      <div class="col-md-3">

        <!-- Blog Search Well -->
         <div class="well">
          <h4>Room Search</h4>
          `<div class="input-group">

            <select neme="roomnumber">
            <option value="---">------</option>
            <option value="101호">101호</option>
            <option value="102호">102호</option>
            <option value="103호">103호</option>
            <option value="104호">104호</option>
          </select>
            <!-- <span class="input-group-btn">
                            <button class="btn btn-default" type="button">
                                <span class="glyphicon glyphicon-search"></span>
            </button>
            </span> -->
          </div>
        </div>

        <!-- Blog Categories Well -->
        <div class="well">
          <h4>Check In/out</h4>
          <div class="row">
            <div class="col-md-12">
                <div class="control-group">
          			<label class="control-label" for="from">From</label>
          			<div class="controls">
            			<input type="text" id="from"/>
          			</div>
        		</div>
              	<div class="control-group">
          			<label class="control-label" for="to">To</label>
          			<div class="controls">
            			<input type="text" id='to'/>
          			</div>
        		</div>
            </div>
            <!-- <div class="col-md-5">
              <ul class="list-unstyled">
                <li>

                </li>
              </ul>
            </div> -->
          </div>
          <!-- /.row -->
        </div>
        <script src="${root }/page/house/js/index.js"></script>

        <!-- Side Widget Well -->
        <div class="well">
          <h4>Reservation State</h4>
          <p>Before booking <br> Please check again</p>
          <button type="button" class="btn btn-primary" id=Reservation>Reservation</button>
        </div>



<!-- -------------------- Map --------------------- -->
        <style>
          #map {
            height: 400px;
            width: 100%;
          }
        </style>
        <h3>Guset 하우스 위치</h3>
        <div id="map">
        <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a10b55340969923033a4eb61fd837e6e"></script>
		<script>
		var locx = 33.450701;
		var locy = 126.570667;
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div
		    mapOption = {
		        center: new daum.maps.LatLng(locx, locy), // 지도의 중심좌표
		        level: 3 // 지도의 확대 레벨
		    };

		var map = new daum.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		// 마커가 표시될 위치입니다
		var markerPosition  = new daum.maps.LatLng(locx, locy);

		// 마커를 생성합니다
		var marker = new daum.maps.Marker({
		    position: markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);

		// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
		// marker.setMap(null);
		// 지도타입 컨트롤의 지도 또는 스카이뷰 버튼을 클릭하면 호출되어 지도타입을 바꾸는 함수입니다
		function setMapType(maptype) {
		    var roadmapControl = document.getElementById('btnRoadmap');
		    var skyviewControl = document.getElementById('btnSkyview');
		    if (maptype === 'roadmap') {
		        map.setMapTypeId(daum.maps.MapTypeId.ROADMAP);
		        roadmapControl.className = 'selected_btn';
		        skyviewControl.className = 'btn';
		    } else {
		        map.setMapTypeId(daum.maps.MapTypeId.HYBRID);
		        skyviewControl.className = 'selected_btn';
		        roadmapControl.className = 'btn';
		    }
		}

		// 지도 확대, 축소 컨트롤에서 확대 버튼을 누르면 호출되어 지도를 확대하는 함수입니다
		function zoomIn() {
		    map.setLevel(map.getLevel() - 1);
		}

		// 지도 확대, 축소 컨트롤에서 축소 버튼을 누르면 호출되어 지도를 확대하는 함수입니다
		function zoomOut() {
		    map.setLevel(map.getLevel() + 1);
		}
		</script>
		</div>
	</div>





<!-- 여기까지가 우리가 꾸밀부분 -->
<!-- 푸터 -->
<%@ include file="/page/template/footer.jsp" %>
