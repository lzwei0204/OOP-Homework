import java.util.Scanner;

class animal{
	String name;
	double height;
	int weight;
	int speed;

    public animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    
	void show(){
	System.out.println("名稱:"+name);
	System.out.println("身高:"+height+ " m");
	System.out.println("體重:"+weight+ " kg");
	System.out.println("速度:"+speed+ " m/mins");
	}
	
	double distance	(int time,double a) {
		return time * a * speed;
	}
	
	double distance (int time) {
        return time * speed;
    }

	public static void start(){
		System.out.println("歡迎進入冰雪奇緣系統。");
	}
}

class human extends animal{
	private String gender;

	public human(String name, double height, int weight, int speed, String gender) {
        super(name, height, weight, speed);
		this.gender = gender;
    }

	@Override
	public void show(){
		super.show();
		System.out.println("性別:"+gender);
	}
}

class snow extends human{
	private boolean freeze;

	public snow(String name, double height, int weight, int speed, String gender, boolean freeze) {
        super(name, height, weight, speed, gender);
		this.freeze = freeze;
    }

	@Override
	public void show(){
		super.show();
		System.out.println("冰凍技能:"+freeze);
	}

	@Override
	double distance	(int time,double a) {
		return super.distance(time, a) * 2;
	}
	
	double distance (int time) {
        return super.distance(time) * 2;
	}
}

public class A1091227_0331 {
	public static void main(String[] args) {
		animal.start();
		
		animal[] animals = new animal[2];
		animals[0] = new animal("雪寶",1.1,52,100);
		animals[1] = new animal("驢子",1.5,99,200);
		human[] humans = new human[3];
		humans[0] = new human("阿克",1.9,80,150,"男");
		humans[1] = new human("漢斯",1.8,78,130,"男");
		humans[2] = new human("安那",1.7,48,120,"女");
		snow[] snows = new snow[1];
		snows[0] = new snow("愛沙",1.7,50,120,"女", true);
		
		for(int i=0;i<animals.length;i++) {
			animals[i].show();
			System.out.println();
		}

		for(int i=0;i<humans.length;i++) {
			humans[i].show();
			System.out.println();
		}

		for(int i=0;i<snows.length;i++) {
			snows[i].show();
			System.out.println();
		}
		
        Scanner sc = new Scanner(System.in);
        
        for (int i=0;i<animals.length;i++) {
            System.out.println("請輸入 " + animals[i].name + " 奔跑的時間 (分鐘): ");
            int x = sc.nextInt();
            System.out.println("請輸入 " + animals[i].name + " 奔跑的加速度(輸入 0 為未知): ");
            double y = sc.nextDouble();
            double distance ;
            if 	(y==0) {
            	distance = animals[i].distance(x);
            }else {
            	distance = animals[i].distance(x, y);	
            }
            System.out.println(animals[i].name + " 跑了 " + distance + " 公尺");
        }

		for (int i=0;i<humans.length;i++) {
            System.out.println("請輸入 " + humans[i].name + " 奔跑的時間 (分鐘): ");
            int x = sc.nextInt();
            System.out.println("請輸入 " + humans[i].name + " 奔跑的加速度(輸入 0 為未知): ");
            double y = sc.nextDouble();
            double distance ;
            if 	(y==0) {
            	distance = humans[i].distance(x);
            }else {
            	distance = humans[i].distance(x, y);	
            }
            System.out.println(humans[i].name + " 跑了 " + distance + " 公尺");
        }

		for (int i=0;i<snows.length;i++) {
            System.out.println("請輸入 " + snows[i].name + " 奔跑的時間 (分鐘): ");
            int x = sc.nextInt();
            System.out.println("請輸入 " + snows[i].name + " 奔跑的加速度(輸入 0 為未知): ");
            double y = sc.nextDouble();
            double distance ;
            if 	(y==0) {
            	distance = snows[i].distance(x);
            }else {
            	distance = snows[i].distance(x, y);	
            }
            System.out.println(snows[i].name + " 跑了 " + distance + " 公尺");
        }
	}
}
