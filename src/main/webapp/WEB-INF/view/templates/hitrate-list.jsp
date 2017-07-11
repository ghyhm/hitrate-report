<input type="text" name="visitDate" ng-model="hitrateCtrl.hitrate.visitDate" />
<input type="submit" ng-click="hitrateCtrl.searchHitrates(hitrateCtrl.hitrate)" value="Search" />
<table>
	<tr>
		<th>ID</th>
		<th>Visit Date</th>
		<th>Location</th>
		<th>Visits</th>
	</tr>
	<tr ng-repeat="row in hitrateCtrl.hitrates">
		<td><span ng-bind="row.id"></span></td>
		<td><span ng-bind="row.visitDate | date: 'yyyy-MM-dd'"></span></td>
		<td><span ng-bind="row.website"></span></td>
		<td><span ng-bind="row.visits"></span></td>
<!-- 		<td><input type="button" ng-click="hitrateCtrl.deleteHitrate(row.pid)" -->
<!-- 			value="Delete" /> <input type="button" -->
<!-- 			ng-click="hitrateCtrl.editHitrate(row.pid)" value="Edit" /> <span -->
<!-- 			ng-if="hitrateCtrl.flag=='updated' && row.pid==hitrateCtrl.updatedId" -->
<!-- 			class="msg-success">Hitrate successfully updated.</span></td> -->
	</tr>
</table>