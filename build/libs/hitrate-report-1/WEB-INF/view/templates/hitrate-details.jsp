<table>
	<tr>
		<td colspan="2">
			<div ng-if="!hitrateCtrl.hitrate.pid">
				<h3>Add New Hitrate</h3>
			</div>
			<div ng-if="hitrateCtrl.hitrate.pid">
				<h3>Update Hitrate for ID: {{ hitrateCtrl.hitrate.pid }}</h3>
                <input type="hidden" ng-model="hitrateCtrl.hitrate.pid" />
			</div>
		</td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="name" ng-model="hitrateCtrl.hitrate.name"
			required /> <span ng-show="hitrateForm.name.$error.required"
			class="msg-val">Name is required.</span></td>
	</tr>
	<tr>
		<td>Location:</td>
		<td><input type="text" name="location"
			ng-model="hitrateCtrl.hitrate.location" required /> <span
			ng-show="hitrateForm.location.$error.required" class="msg-val">Location
				is required.</span></td>
	</tr>
	<tr>
		<td colspan="2"><span ng-if="hitrateCtrl.flag=='created'"
			class="msg-success">Hitrate successfully added.</span> <span
			ng-if="hitrateCtrl.flag=='failed'" class="msg-val">Hitrate already
				exists.</span></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" ng-click="hitrateCtrl.submit(hitrateCtrl.hitrate)" value="{{!hitrateCtrl.hitrate.pid ? 'Add Hitrate' : 'Update Hitrate'}}" ng-disabled="hitrateForm.$invalid"/>
			<input type="button" ng-click="hitrateCtrl.reset()" value="Reset" />
		</td>
	</tr>
	<tr>
		<td colspan="2"><span ng-if="hitrateCtrl.flag=='deleted'"
			class="msg-success">Hitrate successfully deleted.</span>
	</tr>
</table>
