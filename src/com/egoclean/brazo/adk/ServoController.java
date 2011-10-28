/*
 * DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *                     Version 2, December 2004
 *
 *  Copyright (C) 2011 Cristian Castiblanco <cristian@elhacker.net>
 *
 *  Everyone is permitted to copy and distribute verbatim or modified
 *  copies of this license document, and changing it is allowed as long
 *  as the name is changed.
 *
 *             DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *    TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 *   0. You just DO WHAT THE FUCK YOU WANT TO.
 */

package com.egoclean.brazo.adk;

import com.egoclean.brazo.ui.ArmActivity;

class ServoController {
	private final byte mCommandTarget;
	private final ArmActivity mActivity;

	public ServoController(ArmActivity activity, int servoNumber) {
		mActivity = activity;
		mCommandTarget = (byte) (servoNumber + 10);
	}

	public void changePosition(double value) {
		mActivity.sendCommand(mCommandTarget, (int) value);
	}
}
