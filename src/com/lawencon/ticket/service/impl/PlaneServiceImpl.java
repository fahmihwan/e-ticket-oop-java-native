package com.lawencon.ticket.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.ticket.model.Chair;
import com.lawencon.ticket.model.Schedule;
import com.lawencon.ticket.service.PlaneService;

public class PlaneServiceImpl implements PlaneService {

	@Override
	public List<Schedule> findPlaneSchedule() {

		List<Schedule> listSchedule = new ArrayList<>();

		final Schedule garuda = new Schedule();
		garuda.setScheduleId(1);
		garuda.setName("Garuda");
		garuda.setDate("16 Juni 2023");
		garuda.setFrom("Jakarta");
		garuda.setTo("Bandung");
		garuda.setPrice(100000);
		listSchedule.add(garuda);

		final Schedule lion = new Schedule();
		lion.setScheduleId(2);
		lion.setName("Lion");
		lion.setDate("17 Juni 2023");
		lion.setFrom("Jakarta");
		lion.setTo("Surabaya");
		lion.setPrice(200000);
		listSchedule.add(lion);

		final Schedule batik = new Schedule();
		batik.setScheduleId(3);
		batik.setName("Batik");
		batik.setDate("18 Juni 2023");
		batik.setFrom("Jakarta");
		batik.setTo("Yogyakarta");
		batik.setPrice(300000);
		listSchedule.add(batik);

		final Schedule boeing = new Schedule();
		boeing.setScheduleId(4);
		boeing.setName("Boeing");
		boeing.setDate("19 Juni 2023");
		boeing.setFrom("Jakarta");
		boeing.setTo("Malang");
		boeing.setPrice(400000);
		listSchedule.add(boeing);

		final Schedule airbus = new Schedule();
		airbus.setScheduleId(5);
		airbus.setName("AirBus");
		airbus.setDate("20 Juni 2023");
		airbus.setFrom("Jakarta");
		airbus.setTo("Semarang");
		airbus.setPrice(500000);
		listSchedule.add(airbus);

		final Schedule airasia = new Schedule();
		airasia.setScheduleId(6);
		airasia.setName("Air Asia");
		airasia.setDate("21 Juni 2023");
		airasia.setFrom("Jakarta");
		airasia.setTo("Balikpapan");
		airasia.setPrice(600000);
		listSchedule.add(airasia);

		final Schedule Sriwijaya = new Schedule();
		Sriwijaya.setScheduleId(7);
		Sriwijaya.setName("Sriwijaya");
		Sriwijaya.setDate("22 Juni 2023");
		Sriwijaya.setFrom("Jakarta");
		Sriwijaya.setTo("Bali");
		Sriwijaya.setPrice(700000);
		listSchedule.add(Sriwijaya);

		final Schedule namair = new Schedule();
		namair.setScheduleId(8);
		namair.setName("Nam Air");
		namair.setDate("23 Juni 2023");
		namair.setFrom("Jakarta");
		namair.setTo("Papua");
		namair.setPrice(800000);
		listSchedule.add(namair);

		final Schedule adamair = new Schedule();
		adamair.setScheduleId(9);
		adamair.setName("Adam Air");
		adamair.setDate("24 Juni 2023");
		adamair.setFrom("Jakarta");
		adamair.setTo("Samarinda");
		adamair.setPrice(900000);
		listSchedule.add(adamair);

		final Schedule qatar = new Schedule();
		qatar.setScheduleId(10);
		qatar.setName("Qatar airways");
		qatar.setDate("25 Juni 2023");
		qatar.setFrom("Jakarta");
		qatar.setTo("Malaysia");
		qatar.setPrice(1000000);
		listSchedule.add(qatar);

		return listSchedule;
	}

	@Override
	public List<Chair> findPlaneChair(int input) {

		final List<Chair> listChair = new ArrayList<>();

		final Chair codeA1 = new Chair();
		codeA1.setScheduleId(1);
		codeA1.setCode("A1");
		listChair.add(codeA1);

		final Chair codeA2 = new Chair();
		codeA2.setScheduleId(1);
		codeA2.setCode("A2");
		listChair.add(codeA2);

		final Chair codeA3 = new Chair();
		codeA3.setScheduleId(1);
		codeA3.setCode("A3");
		listChair.add(codeA3);

		final Chair codeA4 = new Chair();
		codeA4.setScheduleId(1);
		codeA4.setCode("A4");
		listChair.add(codeA4);

		final Chair CodeA5 = new Chair();
		CodeA5.setScheduleId(1);
		CodeA5.setCode("A5");
		listChair.add(CodeA5);

		final Chair codeA6 = new Chair();
		codeA6.setScheduleId(1);
		codeA6.setCode("A6");
		listChair.add(codeA6);

		final Chair codeA7 = new Chair();
		codeA7.setScheduleId(1);
		codeA7.setCode("A7");
		listChair.add(codeA7);

		final Chair codeA8 = new Chair();
		codeA8.setScheduleId(1);
		codeA8.setCode("A8");
		listChair.add(codeA8);

		final Chair codeA9 = new Chair();
		codeA9.setScheduleId(1);
		codeA9.setCode("A9");
		listChair.add(codeA9);

		final Chair codeA10 = new Chair();
		codeA10.setScheduleId(1);
		codeA10.setCode("A10");
		listChair.add(codeA10);

		final Chair codeA11 = new Chair();
		codeA11.setScheduleId(2);
		codeA11.setCode("A11");
		listChair.add(codeA11);

		final Chair codeA12 = new Chair();
		codeA12.setScheduleId(2);
		codeA12.setCode("A12");
		listChair.add(codeA12);

		final Chair codeA13 = new Chair();
		codeA13.setScheduleId(2);
		codeA13.setCode("A13");
		listChair.add(codeA13);

		final Chair codeA14 = new Chair();
		codeA14.setScheduleId(2);
		codeA14.setCode("A14");
		listChair.add(codeA14);

		final Chair codeA15 = new Chair();
		codeA15.setScheduleId(2);
		codeA15.setCode("A15");
		listChair.add(codeA15);

		final Chair codeA16 = new Chair();
		codeA16.setScheduleId(2);
		codeA16.setCode("A16");
		listChair.add(codeA16);

		final Chair codeA17 = new Chair();
		codeA17.setScheduleId(2);
		codeA17.setCode("A17");
		listChair.add(codeA17);

		final Chair codeA18 = new Chair();
		codeA18.setScheduleId(2);
		codeA18.setCode("A18");
		listChair.add(codeA18);

		final Chair codeA19 = new Chair();
		codeA19.setScheduleId(2);
		codeA19.setCode("A19");
		listChair.add(codeA19);

		final Chair codeA20 = new Chair();
		codeA20.setScheduleId(2);
		codeA20.setCode("A20");
		listChair.add(codeA20);

		final Chair codeA21 = new Chair();
		codeA21.setScheduleId(3);
		codeA21.setCode("A21");
		listChair.add(codeA21);

		final Chair codeA22 = new Chair();
		codeA22.setScheduleId(3);
		codeA22.setCode("A22");
		listChair.add(codeA22);

		final Chair codeA23 = new Chair();
		codeA23.setScheduleId(3);
		codeA23.setCode("A23");
		listChair.add(codeA23);

		final Chair codeA24 = new Chair();
		codeA24.setScheduleId(3);
		codeA24.setCode("A24");
		listChair.add(codeA24);

		final Chair codeA25 = new Chair();
		codeA25.setScheduleId(3);
		codeA25.setCode("A25");
		listChair.add(codeA25);

		final Chair codeA26 = new Chair();
		codeA26.setScheduleId(3);
		codeA26.setCode("A26");
		listChair.add(codeA26);

		final Chair codeA27 = new Chair();
		codeA27.setScheduleId(3);
		codeA27.setCode("A27");
		listChair.add(codeA27);

		final Chair codeA28 = new Chair();
		codeA28.setScheduleId(3);
		codeA28.setCode("A28");
		listChair.add(codeA28);

		final Chair codeA29 = new Chair();
		codeA29.setScheduleId(3);
		codeA29.setCode("A29");
		listChair.add(codeA29);

		final Chair codeA30 = new Chair();
		codeA30.setScheduleId(3);
		codeA30.setCode("A30");
		listChair.add(codeA30);

		final Chair codeA31 = new Chair();
		codeA31.setScheduleId(4);
		codeA31.setCode("A31");
		listChair.add(codeA31);

		final Chair codeA32 = new Chair();
		codeA32.setScheduleId(4);
		codeA32.setCode("A32");
		listChair.add(codeA32);

		final Chair codeA33 = new Chair();
		codeA33.setScheduleId(4);
		codeA33.setCode("A33");
		listChair.add(codeA33);

		final Chair codeA34 = new Chair();
		codeA34.setScheduleId(4);
		codeA34.setCode("A34");
		listChair.add(codeA34);

		final Chair codeA35 = new Chair();
		codeA35.setScheduleId(4);
		codeA35.setCode("A35");
		listChair.add(codeA35);

		final Chair codeA36 = new Chair();
		codeA36.setScheduleId(4);
		codeA36.setCode("A36");
		listChair.add(codeA36);

		final Chair codeA37 = new Chair();
		codeA37.setScheduleId(4);
		codeA37.setCode("A37");
		listChair.add(codeA37);

		final Chair codeA38 = new Chair();
		codeA38.setScheduleId(4);
		codeA38.setCode("A38");
		listChair.add(codeA38);

		final Chair codeA39 = new Chair();
		codeA39.setScheduleId(4);
		codeA39.setCode("A39");
		listChair.add(codeA39);

		final Chair codeA40 = new Chair();
		codeA40.setScheduleId(4);
		codeA40.setCode("A40");
		listChair.add(codeA40);

		final Chair codeA41 = new Chair();
		codeA41.setScheduleId(5);
		codeA41.setCode("A41");
		listChair.add(codeA41);

		final Chair codeA42 = new Chair();
		codeA42.setScheduleId(5);
		codeA42.setCode("A42");
		listChair.add(codeA42);

		final Chair codeA43 = new Chair();
		codeA43.setScheduleId(5);
		codeA43.setCode("A43");
		listChair.add(codeA43);

		final Chair codeA44 = new Chair();
		codeA44.setScheduleId(5);
		codeA44.setCode("A44");
		listChair.add(codeA44);

		final Chair codeA45 = new Chair();
		codeA45.setScheduleId(5);
		codeA45.setCode("A45");
		listChair.add(codeA45);

		final Chair codeA46 = new Chair();
		codeA46.setScheduleId(5);
		codeA46.setCode("A46");
		listChair.add(codeA46);

		final Chair codeA47 = new Chair();
		codeA47.setScheduleId(5);
		codeA47.setCode("A47");
		listChair.add(codeA47);

		final Chair codeA48 = new Chair();
		codeA48.setScheduleId(5);
		codeA48.setCode("A48");
		listChair.add(codeA48);

		final Chair codeA49 = new Chair();
		codeA49.setScheduleId(5);
		codeA49.setCode("A49");
		listChair.add(codeA49);

		final Chair codeA50 = new Chair();
		codeA50.setScheduleId(5);
		codeA50.setCode("A5");
		listChair.add(codeA50);

		final Chair codeA51 = new Chair();
		codeA51.setScheduleId(6);
		codeA51.setCode("A51");
		listChair.add(codeA51);

		final Chair codeA52 = new Chair();
		codeA52.setScheduleId(6);
		codeA52.setCode("A52");
		listChair.add(codeA52);

		final Chair codeA53 = new Chair();
		codeA53.setScheduleId(6);
		codeA53.setCode("A53");
		listChair.add(codeA53);

		final Chair codeA54 = new Chair();
		codeA54.setScheduleId(6);
		codeA54.setCode("A54");
		listChair.add(codeA54);

		final Chair codeA55 = new Chair();
		codeA55.setScheduleId(6);
		codeA55.setCode("A55");
		listChair.add(codeA55);

		final Chair codeA56 = new Chair();
		codeA56.setScheduleId(6);
		codeA56.setCode("A56");
		listChair.add(codeA56);

		final Chair codeA57 = new Chair();
		codeA57.setScheduleId(6);
		codeA57.setCode("A57");
		listChair.add(codeA57);

		final Chair codeA58 = new Chair();
		codeA58.setScheduleId(6);
		codeA58.setCode("A58");
		listChair.add(codeA58);

		final Chair codeA59 = new Chair();
		codeA59.setScheduleId(6);
		codeA59.setCode("A59");
		listChair.add(codeA59);

		final Chair codeA60 = new Chair();
		codeA60.setScheduleId(6);
		codeA60.setCode("A60");
		listChair.add(codeA60);

		final Chair codeA61 = new Chair();
		codeA61.setScheduleId(7);
		codeA61.setCode("A61");
		listChair.add(codeA61);

		final Chair codeA62 = new Chair();
		codeA62.setScheduleId(7);
		codeA62.setCode("A62");
		listChair.add(codeA62);

		final Chair codeA63 = new Chair();
		codeA63.setScheduleId(7);
		codeA63.setCode("A63");
		listChair.add(codeA63);

		final Chair codeA64 = new Chair();
		codeA64.setScheduleId(7);
		codeA64.setCode("A64");
		listChair.add(codeA64);

		final Chair codeA65 = new Chair();
		codeA65.setScheduleId(7);
		codeA65.setCode("A65");
		listChair.add(codeA65);

		final Chair codeA66 = new Chair();
		codeA66.setScheduleId(7);
		codeA66.setCode("A66");
		listChair.add(codeA66);

		final Chair codeA67 = new Chair();
		codeA67.setScheduleId(7);
		codeA67.setCode("A67");
		listChair.add(codeA67);

		final Chair codeA68 = new Chair();
		codeA68.setScheduleId(7);
		codeA68.setCode("A68");
		listChair.add(codeA68);

		final Chair codeA69 = new Chair();
		codeA69.setScheduleId(7);
		codeA69.setCode("A69");
		listChair.add(codeA69);

		final Chair codeA70 = new Chair();
		codeA70.setScheduleId(7);
		codeA70.setCode("A70");
		listChair.add(codeA70);

		final Chair codeA71 = new Chair();
		codeA71.setScheduleId(8);
		codeA71.setCode("A71");
		listChair.add(codeA71);

		final Chair codeA72 = new Chair();
		codeA72.setScheduleId(8);
		codeA72.setCode("A72");
		listChair.add(codeA72);

		final Chair codeA73 = new Chair();
		codeA73.setScheduleId(8);
		codeA73.setCode("A73");
		listChair.add(codeA73);

		final Chair codeA74 = new Chair();
		codeA74.setScheduleId(8);
		codeA74.setCode("A74");
		listChair.add(codeA74);

		final Chair codeA75 = new Chair();
		codeA75.setScheduleId(8);
		codeA75.setCode("A75");
		listChair.add(codeA75);

		final Chair codeA76 = new Chair();
		codeA76.setScheduleId(8);
		codeA76.setCode("A76");
		listChair.add(codeA76);

		final Chair codeA77 = new Chair();
		codeA77.setScheduleId(8);
		codeA77.setCode("A77");
		listChair.add(codeA77);

		final Chair codeA78 = new Chair();
		codeA78.setScheduleId(8);
		codeA78.setCode("A78");
		listChair.add(codeA78);

		final Chair codeA80 = new Chair();
		codeA80.setScheduleId(8);
		codeA80.setCode("A80");
		listChair.add(codeA80);

		final Chair codeA81 = new Chair();
		codeA81.setScheduleId(9);
		codeA81.setCode("A81");
		listChair.add(codeA81);

		final Chair codeA82 = new Chair();
		codeA82.setScheduleId(9);
		codeA82.setCode("A82");
		listChair.add(codeA82);

		final Chair codeA83 = new Chair();
		codeA83.setScheduleId(9);
		codeA83.setCode("A83");
		listChair.add(codeA83);

		final Chair codeA84 = new Chair();
		codeA84.setScheduleId(9);
		codeA84.setCode("A84");
		listChair.add(codeA84);

		final Chair codeA85 = new Chair();
		codeA85.setScheduleId(9);
		codeA85.setCode("A85");
		listChair.add(codeA85);

		final Chair codeA86 = new Chair();
		codeA86.setScheduleId(9);
		codeA86.setCode("A86");
		listChair.add(codeA86);

		final Chair codeA87 = new Chair();
		codeA87.setScheduleId(9);
		codeA87.setCode("A87");
		listChair.add(codeA87);

		final Chair codeA88 = new Chair();
		codeA88.setScheduleId(9);
		codeA88.setCode("A88");
		listChair.add(codeA88);

		final Chair codeA89 = new Chair();
		codeA89.setScheduleId(9);
		codeA89.setCode("A89");
		listChair.add(codeA89);

		final Chair codeA90 = new Chair();
		codeA90.setScheduleId(9);
		codeA90.setCode("A90");
		listChair.add(codeA90);

		final Chair codeA91 = new Chair();
		codeA91.setScheduleId(10);
		codeA91.setCode("A91");
		listChair.add(codeA91);

		final Chair codeA92 = new Chair();
		codeA92.setScheduleId(10);
		codeA92.setCode("A92");
		listChair.add(codeA92);

		final Chair codeA93 = new Chair();
		codeA93.setScheduleId(10);
		codeA93.setCode("A93");
		listChair.add(codeA93);

		final Chair codeA94 = new Chair();
		codeA94.setScheduleId(10);
		codeA94.setCode("A94");
		listChair.add(codeA94);

		final Chair codeA95 = new Chair();
		codeA95.setScheduleId(10);
		codeA95.setCode("A95");
		listChair.add(codeA95);

		final Chair codeA96 = new Chair();
		codeA96.setScheduleId(10);
		codeA96.setCode("A96");
		listChair.add(codeA96);

		final Chair codeA97 = new Chair();
		codeA97.setScheduleId(10);
		codeA97.setCode("A97");
		listChair.add(codeA97);

		final Chair codeA98 = new Chair();
		codeA98.setScheduleId(10);
		codeA98.setCode("A98");
		listChair.add(codeA98);

		final Chair codeA99 = new Chair();
		codeA99.setScheduleId(10);
		codeA99.setCode("A99");
		listChair.add(codeA99);

		final Chair codeA100 = new Chair();
		codeA100.setScheduleId(10);
		codeA100.setCode("A100");
		listChair.add(codeA100);

		final List<Chair> listOptionChair = new ArrayList<>();

		for (int i = 0; i < listChair.size(); i++) {
			final Chair chair = listChair.get(i);
			if (chair.getScheduleId() == input) {
				listOptionChair.add(chair);
			}
		}

		return listOptionChair;
	}

}
