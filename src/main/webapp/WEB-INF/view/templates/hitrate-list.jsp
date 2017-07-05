<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Location</th>
	</tr>
	<tr ng-repeat="row in hitrateCtrl.hitrates">
		<td><span ng-bind="row.pid"></span></td>
		<td><span ng-bind="row.name"></span></td>
		<td><span ng-bind="row.location"></span></td>
<!-- 		<td><input type="button" ng-click="hitrateCtrl.deleteHitrate(row.pid)" -->
<!-- 			value="Delete" /> <input type="button" -->
<!-- 			ng-click="hitrateCtrl.editHitrate(row.pid)" value="Edit" /> <span -->
<!-- 			ng-if="hitrateCtrl.flag=='updated' && row.pid==hitrateCtrl.updatedId" -->
<!-- 			class="msg-success">Hitrate successfully updated.</span></td> -->
		<td><input type="button" ng-click="hitrateCtrl.deleteHitrate(row.pid)"
			value="Delete" /> <a href="#!hitrate/{{row.pid}}">Edit</a> <span
			ng-if="hitrateCtrl.flag=='updated' && row.pid==hitrateCtrl.updatedId"
			class="msg-success">Hitrate successfully updated.</span></td>
	</tr>
</table>