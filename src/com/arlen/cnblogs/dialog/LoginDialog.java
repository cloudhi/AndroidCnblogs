package com.arlen.cnblogs.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

public class LoginDialog {
	//
	private Context mContext;
	// �ȴ��Ի���ı���
	private String mTitle;
	// �ȴ�����
	private String mMessage;
	// show
	private final int SHOW = 1;
	// dismiss
	private final int DISMISS = 0;

	public LoginDialog(Context mContext) {
		this.mContext = mContext;
	}

	// ���ƽ��ȶԻ������ʾ����ʧ
	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case SHOW:
				progressDialog = ProgressDialog
						.show(mContext, mTitle, mMessage);
				break;
			case DISMISS:
				progressDialog.dismiss();
				break;
			}
		}
	};
	// ���ȶԻ���
	private ProgressDialog progressDialog = null;

	/**
	 * ���ý��ȶԻ���
	 * 
	 * @param title
	 *            ���ȿ�ı���
	 * @param message
	 *            ���ȿ���ʾ������
	 * @param callBack
	 *            �ص���ִ�з���
	 */
	public void showProgressDialog(String title, String message,
			final ProgressCallBack callBack) {
		this.mTitle = title;
		this.mMessage = message;
		handler.sendEmptyMessage(SHOW);// �����Ի���
		new Thread() {
			public void run() {
				callBack.action();// ִ�в���
				handler.sendEmptyMessage(DISMISS);// ִ����ϣ��رնԻ���
			}
		}.start();
	}

	// Ҫ�ڽ��ȶԻ�����ʾʱִ�еĲ���
	public interface ProgressCallBack {
		public void action();
	}
}
