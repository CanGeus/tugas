<script type="text/javascript">
        function tampil() {
                var name = document.daftar.nama.value;
                var gender = document.daftar.kelamin.value;
                var date = document.daftar.tanggal.value;
                var born = document.daftar.lahir.value;
                var address = document.daftar.alamat.value;
                var mail = document.daftar.email.value;
                var pone = document.daftar.phone.value;
                var fell = document.daftar.keluhan.value;
                var care = document.daftar.pelayanan.value;
                var ansurance = document.daftar.asuransi.value;
            if (name!= "" && gender!="" && date !=""&& born!=""&& address!=""&& mail!=""&& pone!=""&& fell!=""&& care!=""&& ansurance!="") {
            newWindow = window.open("invoice.html", "STATUS PENDAFTARAN","width=500, height=200");
            
            
            }else{
                alert('Anda harus mengisi data dengan lengkap !');
            }
            }
    </script>
