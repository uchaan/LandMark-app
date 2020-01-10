package com.example.landmark;

// How to use =============================================================
//        landmark_info london = new landmark_info().get("london eye");
//        String test = london.name;
//        Toast.makeText(getApplicationContext(),
//                test, Toast.LENGTH_LONG).show();
// =========================================================================

public class landmark_info {
    public String name;
    public String info;
    public String website;
    public String ticket;

    public landmark_info(){}

    public void LONDON_EYE(){
        this.name = "LONDON EYE";
        this.info = "런던 아이는 영국 런던 템즈 강변에 위치한 대형 대관람차입니다. 높이가 135m에 달하는유럽에서 가장 높은 대관람차입니다. 매년 350만여명의 관광객이 방문하며 2015년 1월부터 코카콜라의 후원을 받고 있습니다. 런던 아이는 공사가 마무리된 1999년부터 세계에서 가장 높은 대관람차였으나 2006년 중국에서 높이 160m의 난창지싱이 건설되면서 160m로 자리를 내어주게 됩니다. 현재 가장 높은 대관람차는 2008년에 완공된 165m의 싱가포르 플라이어 입니다. 런던 아이의 가장 큰 특징은 바퀴살에 해당하는 중간이 파이프가 아닌 와이어로프로 연결되어 있다는 점입니다. 이 때문에 중간이 뻥 뚫린 것처럼 보인답니다!";
        this.website = "https://www.londoneye.com";
        this.ticket = "https://www.londoneye.com/tickets-and-prices/";

    }

    public void BIG_BEN(){
        this.name = "BIG BEN";
        this.info = "빅 벤은 런던의 웨스트민스터 궁전 북쪽에 위치한 시계탑입니다. 시계탑의 사면에는 세계에서 가장 큰 자명종 시계가 달려 있고, 시계탑 자체도 높이 96.3m로 세계에서 세 번째로 높습니다. 1859년에 세워진 빅 벤은 매년 약 12000명의 관광객이 찾는 대표적인 관광 명소입니다.\n" +
                "본래 웨스트민스터 궁전 건축 당시 시계탑에 붙여졌던 이름 성 스티븐 타워, 종에 붙여졌던 이름은 그레이트 벨 이었지만 모두 공식 제정된 명칭은 아니었습니다. 건설 책임자였던 벤저민 홀 경은 거구로 유명했는데, 여기서 유래한 '빅 벤'이라는 이름이 더 많이 통용되었다고 합니다. 2012년 엘리자베스 2세의 즉위 60주년을 기념하여 빅 벤은 '엘리자베스 타워'라는 공식 명칭을 갖게 되었습니다. 2017년 9월부터 2021년까지 약 4년에 걸친 기간 동안에는 시계탑의 보수 공사로 인해 종을 울리지 않을 예정이라고 합니다. 시계탑과 시계의 디자인은 고딕 양식의 부흥에 일조한 오거스트 푸긴의 작품입니다. 빅 벤의 시계는 멀리서 보면 스테인드글라스 같지만, 한 면이 7 m 인 철제 틀과 312 조각의 오팔글라스로 이루어져 있습니다.  시계의 눈금은 금도금하였고, 테두리에 라틴어로 \"오 주여, 우리의 여왕 빅토리아 1세를 보호하소서” 라는 문구가 새겨져 있다고 합니다. \n";
        this.website = "https://www.parliament.uk";
        this.ticket = "https://www.westminster-abbey.org/ko/visit-us/prices-entry-times";

    }

    public void TOWER_BRIDGE(){
        this.name = "TOWER BRIDGE";
        this.info = "타워 브리지는 영국 런던 시내를 흐르는 템즈 강 위에 도개교와 현수교를 결합한 구조로 지은 다리입니다. 런던 탑 근처에 있기 때문에 이러한 이름이 붙여졌습니다. 총 길이 260m의 거대한 다리는 호레이스 존스에 의해 설계되었습니다. 1886년에 착공을 시작하여 1894년에 완성되었으며, 완공된 첫 달에만 655번이나 다리가 들어올려졌다고 합니다. 처음에는 수력을 이용해 개폐했지만 오늘날에는 전력을 이용하여 1년에 500번 정도 개폐됩니다. 대형 선박이 지나갈 때마다 개폐형으로 만들어진 다리 가운데가 분리되어 양쪽으로 서서히 들리기 시작해 여덟 팔자 모양이 되었다가 거의 90도 가까이 세워집니다. 다리가 들리게 되면 양 탑의 문이 닫히고 브리지 양쪽의 차선은 통제됩니다. 또한, 탑 안에는 도개교의 원리를 알 수 있는 타워 브리지 전시관이 있으며 탑이 건설되었던 당시의 증기 엔진을 전시하고 있습니다. 엘리베이터를 이용해 탑 위로 올라가면 유리 통로로 된, 2개의 탑을 연결하는 인도교가 나옵니다. 타워브릿지는 템스 강은 물론 멀리 런던의 경치를 바라보기에 더할 나위 없는 최고의 전망대입니다. 밤 하늘을 배경으로 조명을 받아 하얗게 빛나는 타워 브리지의 야경은 꼭 놓치지 말기를 바라요! ";
        this.website = "https://www.towerbridge.org.uk";
        this.ticket = "https://towerbridge.recreatex.be/Products/Overview";

    }

    public landmark_info get(String landmark){
        landmark_info result = new landmark_info();

        switch (landmark){
            case "london eye":
                result.LONDON_EYE();
                break;

            case "big ben":
                result.BIG_BEN();
                break;

            case "tower bridge":
                result.TOWER_BRIDGE();
                break;
        }
        return result;
    }

}
