package com.lawencon.ticket.view;

import java.util.List;
import com.lawencon.ticket.model.History;

public class HistoryView {

	void showHistory(List<History> historyList) {

//		final MainView mainView = new MainView();
//		final List<History> historyList = mainView.listHistory;

		for (int i = 0; i < historyList.size(); i++) {
			final History history = historyList.get(i);
			System.out.println(i + 1 + ". " + history.getTransactionId() + " - " + history.getTotal());
		}
	}
}
