package com.example.hope


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.hope.GenericActivity
import com.example.hope.generic2
import com.example.hope.generic3
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
private lateinit var dbRef: DatabaseReference
class RecyclerViewMovieAdapter(
    private val getActivity: AppCompatActivity,
    private val movieLists: List<Movie>
) : RecyclerView.Adapter<RecyclerViewMovieAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_movie_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieLists.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieLists[position]
        holder.tvMovieTitle.text = movie.title
        holder.ivMovieImg.setImageResource(movie.image)
        holder.itemView.setOnClickListener {
            when (movie.title) {
                "Dramebaaz","Quiz Society", "Pheme" , "Shutterbugs", "Raw", "Tgt", "Sangam", "Framex", "Ateliers", "Designerds", "Automobile Society" -> {
                    val intent : Intent
                    intent = Intent(getActivity, GenericActivity::class.java)
                    when (movie.title) {
                        "Dramebaaz" -> {

                            dbRef = FirebaseDatabase.getInstance().getReference("hoKOsgBNAs6iTF6nN9rj")
                            intent.putExtra("mainheading", "Heading")
                            intent.putExtra("mainimage", R.drawable.dramebaaz)
                            intent.putExtra(
                                "role",
                                "Role"
                            )
                            intent.putExtra("secyname", "Secretary")
                            intent.putExtra("secyimg", R.drawable.siddharthch)
                            intent.putExtra("joinsecyname1", "Join Secretary1")
                            intent.putExtra("joinsecyimg1", R.drawable.photoun)
                            intent.putExtra("joinsecyname2", "Join Secretary2")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)

                        }

                        "Shutterbugs" -> {
                            intent.putExtra("mainheading", "Shutterbugs")
                            intent.putExtra("mainimage", R.drawable.shutterbugs)
                            intent.putExtra(
                                "role",
                                "Role:Shutterbugs, the Photography Club of IIT Jodhpur, is a passionate community dedicated to capturing the beauty of the world through the lens. Our club provides a platform for students to explore various aspects of photography, enhance their technical skills, and express their creativity through visual storytelling."
                            )
                            intent.putExtra("secyname", "Nisarg Vaghela")
                            intent.putExtra("secyimg", R.drawable.nisarg)
                            intent.putExtra("joinsecyname1", "Preet Savalia")
                            intent.putExtra("joinsecyimg1", R.drawable.preet)
                            intent.putExtra("joinsecyname2", "Prince Raj")
                            intent.putExtra("joinsecyimg2", R.drawable.prince)
                            intent.putExtra("joinsecyname3", "Shagun suryavanshi")
                            intent.putExtra("joinsecyimg3", R.drawable.shagun)
                        }

                        "Raw" -> {
                            intent.putExtra("mainheading", "Raw")
                            intent.putExtra("mainimage", R.drawable.raw)
                            intent.putExtra(
                                "role",
                                "Role: RAW, the Media Society of IIT Jodhpur, is a dynamic community dedicated to the art and science of media and communication. Our society provides a platform for students to explore various facets of media, including journalism, videography, photography, and content creation, enhancing their skills and expressing their creativity"
                            )
                            intent.putExtra("secyname", "Udit sisodiya")
                            intent.putExtra("secyimg", R.drawable.udit)
                            intent.putExtra("joinsecyname1", "Aditya Rathore")
                            intent.putExtra("joinsecyimg1", R.drawable.photoun)

                        }

                        "Tgt" -> {
                            intent.putExtra("mainheading", "The Groove Theory")
                            intent.putExtra("mainimage", R.drawable.tgt)
                            intent.putExtra(
                                "role",
                                "Role:The Dance Society of IIT Jodhpur is a vibrant and dynamic community dedicated to the art of dance. It plays a crucial role in fostering a creative and energetic campus atmosphere by providing students with opportunities to explore various dance forms, improve their skills,"
                            )
                            intent.putExtra("secyname", "Shrinkhla Awast")
                            intent.putExtra("secyimg", R.drawable.shirnkhla)
                            intent.putExtra("joinsecyname1", "Aditya Padhy")
                            intent.putExtra("joinsecyimg1", R.drawable.adityap)
                            intent.putExtra("joinsecyname2", "Saanjali")
                            intent.putExtra("joinsecyimg2", R.drawable.sanjali)
                            intent.putExtra("joinsecyname3", "Sakshi sharma")
                            intent.putExtra("joinsecyimg3", R.drawable.photoun)
                        }

                        "Sangam" -> {
                            intent.putExtra("mainheading", "Sangam")
                            intent.putExtra("mainimage", R.drawable.sangam)
                            intent.putExtra(
                                "role",
                                "Role:The Music Society of IIT Jodhpur is a vibrant community that brings together music enthusiasts from across the campus. Dedicated to nurturing and showcasing musical talent, our society offers students the opportunity to explore various genres, improve their musical skills, and express their creativity."
                            )
                            intent.putExtra("secyname", "Abhaymani Singh")
                            intent.putExtra("secyimg", R.drawable.abhimani)
                            intent.putExtra("joinsecyname1", "Avani Rai")
                            intent.putExtra("joinsecyimg1", R.drawable.avnirai)
                            intent.putExtra("joinsecyname2", "Krishna Patil")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)

                        }

                        "Framex" -> {
                            intent.putExtra("mainheading", "Frame-X")
                            intent.putExtra("mainimage", R.drawable.frame)
                            intent.putExtra(
                                "role",
                                "Role: The Film and Video Editing Club of IIT Jodhpur is a creative hub for students passionate about filmmaking, video production, and editing. Our club provides a platform for students to explore various aspects of filmmaking, improve their editing skills, and express their creativity through visual storytelling."
                            )
                            intent.putExtra("secyname", "Sidharth Bajaj")
                            intent.putExtra("secyimg", R.drawable.sac)
                            intent.putExtra("joinsecyname1", "Dheeraj Dhakad")
                            intent.putExtra("joinsecyimg1", R.drawable.dheeraj)
                            intent.putExtra("joinsecyname2", "Sangameshawar")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)
                            intent.putExtra("joinsecyname3", "Shashwat Meena")
                            intent.putExtra("joinsecyimg3", R.drawable.shashwat)
                        }

                        "Ateliers" -> {
                            intent.putExtra("mainheading", "Ateliers")
                            intent.putExtra("mainimage", R.drawable.attelies)
                            intent.putExtra(
                                "role",
                                "Role: The Art and Craft Club of IIT Jodhpur is a vibrant community dedicated to the exploration and celebration of visual arts and handmade crafts. Our club provides a platform for students to unleash their creativity, develop artistic skills, and express themselves through various art forms."
                            )
                            intent.putExtra("secyname", "Harshita Sehra")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("joinsecyname1", "Vidhi Jain")
                            intent.putExtra("joinsecyimg1", R.drawable.vidhi)
                            intent.putExtra("joinsecyname2", "Harshika Arya")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)

                        }

                        "Designerds" -> {
                            intent.putExtra("mainheading", "Designerds")
                            intent.putExtra("mainimage", R.drawable.designerds)
                            intent.putExtra(
                                "role",
                                "Role: The Designerds Club of IIT Jodhpur is a creative community dedicated to the art of online design. Our club provides a platform for students to explore various aspects of graphic design, enhance their skills, and express their creativity through digital media."
                            )
                            intent.putExtra("secyname", "Aakrit Gupta")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("joinsecyname1", "Shreyash Roy")
                            intent.putExtra("joinsecyimg1", R.drawable.photoun)
                            intent.putExtra("joinsecyname2", "Abhinav Swami ")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)

                        }
                        "Quiz Society" -> {
                            intent.putExtra("mainheading", "Quiz Society")
                            intent.putExtra("mainimage", R.drawable.quiz)
                            intent.putExtra(
                                "role",
                                "Role: The Quiz Society of IIT Jodhpur is a dynamic community dedicated to the pursuit of knowledge and intellectual curiosity. Our society provides a platform for students to engage in various quiz formats, sharpen their minds, and showcase their quizzing skills.The Quiz Society of IIT Jodhpur is a dynamic community dedicated to the pursuit of knowledge and intellectual curiosity. Our society provides a platform for students to engage in various quiz formats, sharpen their minds, and showcase their quizzing skills."
                            )
                            intent.putExtra("secyname", "Rohan Choudhary")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("joinsecyname1", "Manas Chechani")
                            intent.putExtra("joinsecyimg1", R.drawable.photoun)
                            intent.putExtra("joinsecyname2", "Maulik Desai")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)

                        }
                        "Pheme" -> {
                            intent.putExtra("mainheading", "Pheme")
                            intent.putExtra("mainimage", R.drawable.pheme)
                            intent.putExtra(
                                "role",
                                "Role:"
                            )
                            intent.putExtra("secyname", "Adrika Kunjumon")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("joinsecyname1", "Aastha Bhore")
                            intent.putExtra("joinsecyimg1", R.drawable.photoun)
                            intent.putExtra("joinsecyname2", "Ankit Shaw")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)
                            intent.putExtra("joinsecyname3", "Avichal Sinha")
                            intent.putExtra("joinsecyimg3", R.drawable.photoun)

                        }

                        "Automobile Society" -> {
                            intent.putExtra("mainheading", "Automobile Society")
                            intent.putExtra("mainimage", R.drawable.bolthead)
                            intent.putExtra(
                                "role",
                                "Role: The Automobile Society fosters interest in automotive engineering, organizes workshops, and conducts hands-on projects. It provides students with opportunities to design, build, and innovate, enhancing practical skills and preparing them for careers in the automotive industry."
                            )
                            intent.putExtra("secyname", "Charu Singodia")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("joinsecyname1", "Aman Bhansali")
                            intent.putExtra("joinsecyimg1", R.drawable.photoun)
                            intent.putExtra("joinsecyname2", "Mahima Pradhan")
                            intent.putExtra("joinsecyimg2", R.drawable.photoun)

                        }
                    }
                    getActivity.startActivity(intent)
                }

                "Programming Club", "INSIDE", "Devlup Labs", "GDSC", "Nexus", "Robotics Society", "RAID" -> {
                    val intent : Intent
                    intent = Intent(getActivity, generic2::class.java)
                    when (movie.title) {
                        "RAID" -> {
                            intent.putExtra("mainheading", "RAID")
                            intent.putExtra("mainimage", R.drawable.raid)
                            intent.putExtra(
                                "role",
                                "Role: RAID aim to foster early talent and work on the unexplored usage of Al and Deep Learning in practical applications. The idea is to bring the interested students to a curated frontier where they are provided with information on the latest tools and techniques in Al and Data Science and promote the culture of peer learning"
                            )
                            intent.putExtra("codname1", "Rushi Shah")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "Shubh Goyal")
                            intent.putExtra("codimg2", R.drawable.photoun)


                        }

                        "Programming Club" -> {
                            intent.putExtra("mainheading", "Programming Club")
                            intent.putExtra("mainimage", R.drawable.programmingclub)
                            intent.putExtra(
                                "role",
                                "Role: The Programming Society of a college promotes coding skills, organizes workshops, and hosts hackathons. It fosters a collaborative environment for students to learn various programming languages, solve real-world problems, and prepare for careers in tech through peer learning and industry interactions."
                            )
                            intent.putExtra("codname1", "XXXXXXX")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "XXXXXXX")
                            intent.putExtra("codimg2", R.drawable.photoun)


                        }
                        "INSIDE" -> {
                            intent.putExtra("mainheading", "INSIDE")
                            intent.putExtra("mainimage", R.drawable.inside)
                            intent.putExtra(
                                "role",
                                "Role: The Game Development Club at IIT Jodhpur fosters creativity and technical skills through workshops, coding sessions, and collaborative projects. It provides a platform for students to design and develop games, cultivating a passionate community of aspiring game developers."
                            )
                            intent.putExtra("codname1", "XXXXXXX")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "XXXXXXX")
                            intent.putExtra("codimg2", R.drawable.photoun)


                        }

                        "Devlup Labs" -> {
                            intent.putExtra("mainheading", "Devlup Labs")
                            intent.putExtra("mainimage", R.drawable.devlup)
                            intent.putExtra(
                                "role",
                                "Role:Devlup Labs, fosters innovation and collaboration in the tech community. It supports open-source projects, provides learning opportunities, and encourages contributions to software development, aiming to advance technology and share knowledge globally."
                            )
                            intent.putExtra("codname1", "XXXXXXX")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "XXXXXXX")
                            intent.putExtra("codimg2", R.drawable.photoun)


                        }

                        "GDSC" -> {
                            intent.putExtra("mainheading", "GDSC")
                            intent.putExtra("mainimage", R.drawable.gdsc)
                            intent.putExtra(
                                "role",
                                "Role: GDSC IITJ is a developer's community to provide an opportunity for students to apply their newly gained skills to develop solutions for local and global organizations, and then provide visibility via showcases."
                            )
                            intent.putExtra("codname1", "Het Dave")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "XXXXXXX")
                            intent.putExtra("codimg2", R.drawable.photoun)


                        }

                        "Nexus" -> {
                            intent.putExtra("mainheading", "Nexus")
                            intent.putExtra("mainimage", R.drawable.nexus)
                            intent.putExtra(
                                "role",
                                "Role: Nexus, represent a passionate community of students brought together by a shared fascination for the cosmos. Through various activities, including stargazing sessions, telescope workshops and informative lectures, members can deepen their understanding of celestial phenomena, astronomical discoveries,space exploration."
                            )
                            intent.putExtra("codname1", "Sai Akhil")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "Akshat Jain")
                            intent.putExtra("codimg2", R.drawable.photoun)


                        }

                        "Robotics Society" -> {
                            intent.putExtra("mainheading", "Robotics Society")
                            intent.putExtra("mainimage", R.drawable.robotics)
                            intent.putExtra(
                                "role",
                                "Role: The role of a Robotics Society is to foster innovation, collaboration, and learning in the field of robotics through workshops, competitions, and research projects. It aims to enhance technical skills, encourage teamwork, and inspire members to pursue advancements in robotics technology."
                            )
                            intent.putExtra("codname1", "Yash Golani")
                            intent.putExtra("codimg1", R.drawable.photoun)
                            intent.putExtra("codname2", "Dhruva Kumar Kaushal")
                            intent.putExtra("codimg2", R.drawable.photoun)

                        }

                    }
                    getActivity.startActivity(intent)
                }

               "Weightlifting Society","Badminton Society","Hockey Society" ,"Basketball Society" ,"Chess Society" ,"Cricket Society", "E-Sports Society" ,"Kabaddi Society" ,"VolleyBall Society" ,"Table Tennis Society", "Squash Society", "Lawn Tennis Society" , "Athletic Society" -> {
                    val intent : Intent
                    intent = Intent(getActivity, generic3::class.java)

                    when (movie.title) {
                        "Badminton Society" -> {
                            intent.putExtra("mainheading", "Badminton Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Badminton Society promotes physical fitness and sportsmanship through regular practice sessions, tournaments, and training workshops. It provides a platform for students to improve their skills, compete, and enjoy the sport in a supportive and energetic environment." )
                            intent.putExtra("secyname" , "Manas Dwivedi")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Sukhmanpreet Singh Sandhu")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Manas Chechani")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("capname2" , "Sanika Deshmukh")
                            intent.putExtra("capimg2", R.drawable.photoun)
                        }


                        "Athletic Society" -> {
                            intent.putExtra("mainheading", "Athletic Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Badminton Society promotes physical fitness and sportsmanship through regular practice sessions, tournaments, and training workshops. It provides a platform for students to improve their skills, compete, and enjoy the sport in a supportive and energetic environment." )
                            intent.putExtra("secyname" , "Krishna Dev Solanki")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Uthaya Rajan")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Nishu Kumar")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("capname2" , "Pooja Porwal")
                            intent.putExtra("capimg2", R.drawable.photoun)
                            intent.putExtra("vcapname2" , "Renu Sankhla")
                            intent.putExtra("vcapimg2", R.drawable.photoun)
                        }
                        "Weightlifting Society" -> {
                            intent.putExtra("mainheading", "Weightlifting Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Badminton Society promotes physical fitness and sportsmanship through regular practice sessions, tournaments, and training workshops. It provides a platform for students to improve their skills, compete, and enjoy the sport in a supportive and energetic environment." )
                            intent.putExtra("secyname" , "Manoj Khichar")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Nitin Shankhala")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Amit Singh")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                        }


                        "Basketball Society" -> {
                            intent.putExtra("mainheading", "Basketball Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Basketball Society promotes physical fitness and teamwork through regular practice sessions, matches, and tournaments. It offers a platform for students to develop their skills, compete at various levels, and foster a spirit of sportsmanship." )
                            intent.putExtra("secyname" , "Vilok Parkhi")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Karan b Shisode")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Deepanshu")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("capname2" , "Vellore Sahithi")
                            intent.putExtra("capimg2", R.drawable.photoun)
                            intent.putExtra("vcapname2" , "Princy Gautam")
                            intent.putExtra("vcapimg2", R.drawable.photoun)
                        }




                        "Chess Society" -> {
                            intent.putExtra("mainheading", "Chess Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Chess Society nurtures strategic thinking and cognitive skills. It organizes regular games, tournaments, and strategy workshops, providing a space for students to improve their chess abilities, engage in competitive play, and enjoy intellectual challenges." )
                            intent.putExtra("secyname" , "Mayank")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Chakshu Dhannawat")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Umashankar Prajapati")
                            intent.putExtra("vcapimg", R.drawable.photoun) }



                        "Cricket Society" -> {
                            intent.putExtra("mainheading", "Cricket Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Chess Society nurtures strategic thinking and cognitive skills. It organizes regular games, tournaments, and strategy workshops, providing a space for students to improve their chess abilities, engage in competitive play, and enjoy intellectual challenges." )
                            intent.putExtra("secyname" , "Aniket Devaliya")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Parth Mistry")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Neehal Bajaj")
                            intent.putExtra("vcapimg", R.drawable.photoun) }



                        "E-Sports Society" -> {
                            intent.putExtra("mainheading", "E-Sports Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The E-Sports Club promotes competitive gaming and strategic thinking through tournaments, practice sessions, and events. It offers a platform for students to improve their gaming skills, collaborate in teams, and engage in a growing e-sports community." )
                            intent.putExtra("secyname" , "Arman Garg")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Dhruv Kumar Singh")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Rudraksh Solanki")
                            intent.putExtra("vcapimg", R.drawable.photoun) }


                        "Kabaddi Society" -> {
                            intent.putExtra("mainheading", "Kabaddi Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Kabaddi Club fosters physical fitness and teamwork through regular practice, matches, and tournaments. It provides students with opportunities to develop their kabaddi skills, engage in competitive play, and build a strong sense of sportsmanship and camaraderie." )
                            intent.putExtra("secyname" , "Rohitash Bishnoi")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Abhishek Kumar")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Aditya Trivedi")
                            intent.putExtra("vcapimg", R.drawable.photoun) }


                        "VolleyBall Society" -> {
                            intent.putExtra("mainheading", "VolleyBall Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Volleyball Society fosters physical fitness and team spirit. It organizes training sessions, matches, and tournaments, enabling students to develop their volleyball skills, enjoy the sport, and participate in competitive and recreational play." )
                            intent.putExtra("secyname" , "Surya")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Sabavathi Purya")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Sushant Chivale")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("capname2" , "Sharmila Noudu")
                            intent.putExtra("capimg2", R.drawable.photoun)
                            intent.putExtra("vcapname2" , "Rifa Khan")
                            intent.putExtra("vcapimg2", R.drawable.photoun)
                        }





                        "Table Tennis Society" -> {
                            intent.putExtra("mainheading", "Table Tennis Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Table Tennis Society enhances agility and concentration through regular practice sessions, friendly matches, and competitions. It offers students a platform to improve their table tennis skills, engage in competitive play, and enjoy the sport." )

                            intent.putExtra("secyname" , "Jatin")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Soham Pandya")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Paras Kumar")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("wcapname2" , "Divya Shiva Kumar")
                            intent.putExtra("wcapimg2", R.drawable.photoun)
                            intent.putExtra("vcapname2" , "Prarthna Saika")
                            intent.putExtra("vcapimg2", R.drawable.photoun)
                        }

                        "Squash Club" -> {
                            intent.putExtra("mainheading", "Squash Club")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Squash Club promotes agility and endurance through training sessions, friendly matches, and competitions. It offers a platform for students to enhance their squash skills, compete at various levels, and enjoy the sport in a supportive and energetic environment." )
                            intent.putExtra("secyname" , "Dhruv Gupta")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Shubham Vaishnav")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Varun Desai")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("capname2" , "Madhavi Lathar")
                            intent.putExtra("capimg2", R.drawable.photoun)
                            intent.putExtra("vcapname2" , "Ayushi Rathi")
                            intent.putExtra("vcapimg2", R.drawable.photoun)
                        }



                        "Lawn Tennis Society" -> {
                            intent.putExtra("mainheading", "Lawn Tennis Society")
                            intent.putExtra("mainimage", R.drawable.photoun)
                            intent.putExtra(
                                "role", "The Lawn Tennis Society promotes physical fitness and skill development through training sessions, matches, and tournaments. It provides a venue for students to enhance their tennis abilities, compete at various levels, and enjoy the sport in a supportive environment." )
                            intent.putExtra("secyname" , "Prajwal Sonale")
                            intent.putExtra("secyimg", R.drawable.photoun)
                            intent.putExtra("capname" , "Jayant Sorte")
                            intent.putExtra("capimg", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Ribhav Manish")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                            intent.putExtra("capname2" , "Mansi")
                            intent.putExtra("capimg2", R.drawable.photoun)
                            intent.putExtra("vcapname" , "Anupama Birman")
                            intent.putExtra("vcapimg", R.drawable.photoun)
                        }
                    }

                    getActivity.startActivity(intent)
                }

            }
        }

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMovieTitle: TextView = itemView.findViewById(R.id.tvMovieTitle)
        val ivMovieImg: ImageView = itemView.findViewById(R.id.ivMovieImg)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}
