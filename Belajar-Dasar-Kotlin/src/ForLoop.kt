fun main(){
    var total=0
    val nilai = arrayOf(34,23,54)

    for(value in nilai){
        print(value)
        total++;
        if (total<nilai.size)
            print(",")
    }

    println();

    val daftarNama = arrayOf("Hasbi","Wardin","Amriati","Khaulah","Khalid")
    total=0;
    val separator=","
    for (value in daftarNama){
        print(value)
        total++;

        if (total<daftarNama.size)
            print(separator)
    }

    println()
    println("Total Nama : "+total)
    println()

    val max = 20
    for(i in 1..max step 4){
        print(i.toString())
        if(i<(max-4)) print(",")
    }

    println()

    val daftarNamaSize = daftarNama.size;
    for(i in 0..daftarNamaSize-1){
        println("index ke ${i+1} ${daftarNama.get(i)}")
    }
}